package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 基于JSR-269在生成的class文件中加入一句System.out.println();
 *
 * @author ocean_wll
 * @date 2021/6/15
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OceanTest {
    String msg() default "hello ocean";
}
