package com.horsecoder.common.whuTalent.core.flow.Skills.code;

import cc.eamon.open.flow.core.FlowEngine;
import cc.eamon.open.flow.core.stereotype.Flow;
import cc.eamon.open.flow.spring.FlowComponent;

/**
 * @cn.edu.whu/FLOW_MULTIPLY
 */
@FlowComponent
public class FlowCodeMultiply {

    @Flow("FLOW_CODE_MULTIPLY")
    public void flowCodeRun(Double num1, Double num2) {
        Double result = num1 * num2;
        FlowEngine.instance().register("result", result);
    }
}
