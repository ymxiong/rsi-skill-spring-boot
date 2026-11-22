package com.horsecoder.common.whuTalent.core.flow.domain;

import cc.eamon.open.flow.remote.FlowRequest;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: horsecoder
 * Email: eamon@horsecoder.com
 */
@FeignClient(
    value = "skillTesting-core",
    path = "/facade/engine/flow"
)
public interface FlowEngineFacade {
  @RequestMapping(
      value = "",
      method = RequestMethod.POST
  )
  @ResponseBody
  Map<String, Object> flowEntrance(@RequestBody FlowRequest request) throws Exception;
}
