package com.horsecoder.common.whuTalent.core.flow.Skills.code;

import cc.eamon.open.flow.core.FlowEngine;
import cc.eamon.open.flow.core.stereotype.Flow;
import cc.eamon.open.flow.spring.FlowComponent;

/**
 * @cn.edu.whu/FLOW_TRIM
 */
@FlowComponent
public class FlowCodeTrim {

    @Flow("FLOW_CODE_TRIM")
    public void flowCodeRun(String text) {
        String result = text.trim();
        FlowEngine.instance().register("result", result);
    }
}
