package com.horsecoder.common.whuTalent.core.flow.Run.code;

import cc.eamon.open.flow.core.FlowEngine;
import cc.eamon.open.flow.core.stereotype.Flow;
import cc.eamon.open.flow.spring.FlowComponent;

import java.lang.String;


/**
 * 运行
 * @com.horsecoder.common.whuTalent.skillTesting.core/FLOW_RUN
 * <p>
 * Author: horsecoder
 * Email: eamon@horsecoder.com
 */
@FlowComponent
public class FlowCodeRun {

    /**
     * 运行
     * FLOW_CODE_RUN
     *
     * @param structure 结构
     * @result result 结果
     */
    @Flow("FLOW_CODE_RUN")
    public void flowCodeRun(
            String structure
    ) {
        // 初始化流程出参
        String result = null;
        // TODO：开始流程




        // 结束流程
        FlowEngine.instance().register("result", result);

    }


}
