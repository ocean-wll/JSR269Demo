package example;


import annotation.EnumInnerConstant;

/**
 * @author : ocean_wll
 * @since 2021/6/20
 */
@EnumInnerConstant
public enum ExampleClass {
    //枚举值
    EAT(0, "吃"),

    PLAY(1, "玩"),
    ;
    private Integer status;

    private String desc;

    ExampleClass(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
