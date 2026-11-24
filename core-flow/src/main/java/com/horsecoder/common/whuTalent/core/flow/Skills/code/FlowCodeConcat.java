package com.horsecoder.common.whuTalent.core.flow.Skills.code;

import cc.eamon.open.flow.core.FlowEngine;
import cc.eamon.open.flow.core.stereotype.Flow;
import cc.eamon.open.flow.spring.FlowComponent;

/**
 * @cn.edu.whu/FLOW_CONCAT
 */
@FlowComponent
public class FlowCodeConcat {

    @Flow("FLOW_CODE_CONCAT")
    public void flowCodeRun(String text1, String text2) {
        String result = text1 + text2;
        FlowEngine.instance().register("result", result);
    }
}
