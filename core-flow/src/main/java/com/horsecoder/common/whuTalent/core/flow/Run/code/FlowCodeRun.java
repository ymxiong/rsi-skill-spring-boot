package com.horsecoder.common.whuTalent.core.flow.Run.code;

import cc.eamon.open.flow.core.FlowEngine;
import cc.eamon.open.flow.core.stereotype.Flow;
import cc.eamon.open.flow.spring.FlowComponent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

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

        // structure 可以是先验知识，比如，编排好的数据库结构，编排好的人际关系
        // structure 可以直接是原子能力、流程能力的编排结构
        // structure 可以是Agent的编排结构

        JSONArray array = JSONObject.parseObject(structure).getJSONArray("elements");
        if (array.size() == 1) {
            try {
                Object flowResult = FlowEngine.instance()
                        .register("text1", "你今天真")
                        .register("text2", "帅")
                        .run("@cn.edu.whu/FLOW_CONCAT")
                        .retrieve("result");
                System.out.println(flowResult);
                System.out.println();
            } catch (Exception e) {
                System.out.println();
            }
        } else {
            try {
                Object flowResult = FlowEngine.instance()
                        .register("num1", -10.6494)
                        .register("num2", 5)
                        .run("@cn.edu.whu.ymxiong/FLOW_ADD_ABS")
                        .retrieve("result");
                System.out.println(flowResult);
                System.out.println();
            } catch (Exception e) {
                System.out.println();
            }
        }



        // 结束流程
        FlowEngine.instance().register("result", result);

    }


}
