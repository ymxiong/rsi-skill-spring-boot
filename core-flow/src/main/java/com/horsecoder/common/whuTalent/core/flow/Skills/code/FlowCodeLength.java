package com.horsecoder.common.whuTalent.core.flow.Skills.code;

import cc.eamon.open.flow.core.FlowEngine;
import cc.eamon.open.flow.core.stereotype.Flow;
import cc.eamon.open.flow.spring.FlowComponent;

/**
 * @cn.edu.whu/FLOW_LENGTH
 */
@FlowComponent
public class FlowCodeLength {

    @Flow("FLOW_CODE_LENGTH")
    public void flowCodeRun(String text) {
        Integer result = text.length();
        FlowEngine.instance().register("result", result);
    }
}
