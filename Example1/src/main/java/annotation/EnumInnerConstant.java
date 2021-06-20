package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : ocean_wll
 * @since 2021/6/20
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface EnumInnerConstant {

    /**
     * 默认的内部类名
     */
    String innerClassName() default "ocean";
}
