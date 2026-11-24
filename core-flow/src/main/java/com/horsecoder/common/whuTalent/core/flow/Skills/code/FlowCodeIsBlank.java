package com.horsecoder.common.whuTalent.core.flow.Skills.code;

import cc.eamon.open.flow.core.FlowEngine;
import cc.eamon.open.flow.core.stereotype.Flow;
import cc.eamon.open.flow.spring.FlowComponent;

/**
 * @cn.edu.whu/FLOW_IS_BLANK
 */
@FlowComponent
public class FlowCodeIsBlank {

    @Flow("FLOW_CODE_IS_BLANK")
    public void flowCodeRun(String text) {
        Boolean result = text.trim().isEmpty();
        FlowEngine.instance().register("result", result);
    }
}
