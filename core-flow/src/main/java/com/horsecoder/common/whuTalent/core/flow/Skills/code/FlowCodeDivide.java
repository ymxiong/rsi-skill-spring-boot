package com.horsecoder.common.whuTalent.core.flow.Skills.code;

import cc.eamon.open.flow.core.FlowEngine;
import cc.eamon.open.flow.core.stereotype.Flow;
import cc.eamon.open.flow.spring.FlowComponent;

/**
 * @cn.edu.whu/FLOW_DIVIDE
 */
@FlowComponent
public class FlowCodeDivide {

    @Flow("FLOW_CODE_DIVIDE")
    public void flowCodeRun(Double num1, Double num2) {
        if (num2 == 0.0) {
            throw new IllegalArgumentException("Division by zero");
        }
        Double result = num1 / num2;
        FlowEngine.instance().register("result", result);
    }
}
