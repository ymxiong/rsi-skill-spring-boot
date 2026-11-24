package com.horsecoder.common.whuTalent.core.flow.Skills.code;

import cc.eamon.open.flow.core.FlowEngine;
import cc.eamon.open.flow.core.stereotype.Flow;
import cc.eamon.open.flow.spring.FlowComponent;

/**
 * @cn.edu.whu/FLOW_ABS
 */
@FlowComponent
public class FlowCodeAbs {

    @Flow("FLOW_CODE_ABS")
    public void flowCodeRun(Double num) {
        Double result = Math.abs(num);
        FlowEngine.instance().register("result", result);
    }
}
