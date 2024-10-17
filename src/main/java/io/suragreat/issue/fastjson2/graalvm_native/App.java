package io.suragreat.issue.fastjson2.graalvm_native;

import com.alibaba.fastjson2.JSON;
import io.suragreat.issue.fastjson2.graalvm_native.vo.Image;

import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        String json = """
                {"height":800,"size":"LARGE","title":"image","transparent":"false","uri":"file://image.png","width":600}
                """;
        System.out.println("original json: " + json);
        Image image = JSON.parseObject(json, Image.class);
        System.out.println("image from original json: " + image);
        String jsonString = JSON.toJSONString(image);
        System.out.println("toJSONString: " + jsonString);
        image = JSON.parseObject(jsonString, Image.class);
        System.out.println("image image from toJSONString: " + image);
    }
}
