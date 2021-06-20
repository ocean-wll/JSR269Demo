package model;

import annotation.OceanTest;

/**
 * @author ocean_wll
 * @date 2021/6/15
 */
public class OceanBean {

    @OceanTest(msg = "你好")
    public void test() {
        System.out.println("test msg");
    }
}
