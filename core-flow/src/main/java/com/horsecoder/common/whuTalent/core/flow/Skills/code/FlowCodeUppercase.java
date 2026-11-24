package com.horsecoder.common.whuTalent.core.flow.Skills.code;

import cc.eamon.open.flow.core.FlowEngine;
import cc.eamon.open.flow.core.stereotype.Flow;
import cc.eamon.open.flow.spring.FlowComponent;

import java.util.Locale;

/**
 * @cn.edu.whu/FLOW_UPPERCASE
 */
@FlowComponent
public class FlowCodeUppercase {

    @Flow("FLOW_CODE_UPPERCASE")
    public void flowCodeRun(String text) {
        String result = text.toUpperCase(Locale.ROOT);
        FlowEngine.instance().register("result", result);
    }
}
