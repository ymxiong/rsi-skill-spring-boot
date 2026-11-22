package com.horsecoder.common.whuTalent.core.flow;

import cc.eamon.open.flow.remote.FlowRequest;
import com.horsecoder.common.whuTalent.core.flow.domain.FlowEngineFacade;
import io.swagger.annotations.ApiOperation;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: horsecoder
 * Email: eamon@horsecoder.com
 */
@RestController
@RequestMapping("facade/engine/flow")
public class FlowEngineFacadeImpl implements FlowEngineFacade {
  @Autowired
  private FlowEngineService flowEngineService;

  @ApiOperation(
      value = "默认流程入口",
      notes = "默认流程入口"
  )
  @RequestMapping(
      value = "",
      method = RequestMethod.POST
  )
  @Transactional(
      rollbackFor = Exception.class
  )
  @ResponseBody
  public Map<String, Object> flowEntrance(@RequestBody FlowRequest request) throws Exception {
    return flowEngineService.runFlowByFlowId(request);
  }
}
