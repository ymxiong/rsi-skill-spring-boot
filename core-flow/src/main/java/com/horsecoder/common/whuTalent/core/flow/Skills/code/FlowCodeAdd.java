package com.horsecoder.common.whuTalent.core.flow.Skills.code;

import cc.eamon.open.flow.core.FlowEngine;
import cc.eamon.open.flow.core.stereotype.Flow;
import cc.eamon.open.flow.spring.FlowComponent;


/**
 * 运行
 * @cn.edu.whu/FLOW_ADD
 * <p>
 * Author: horsecoder
 * Email: eamon@horsecoder.com
 */
@FlowComponent
public class FlowCodeAdd {

    /**
     * 运行
     * FLOW_CODE_ADD
     *
     */
    @Flow("FLOW_CODE_ADD")
    public void flowCodeRun(
            Double num1,
            Double num2
    ) {
        // 初始化流程出参
        Double result = null;
        // TODO：开始流程

        result = num1 + num2;


        // 结束流程
        FlowEngine.instance().register("result", result);

    }


}
