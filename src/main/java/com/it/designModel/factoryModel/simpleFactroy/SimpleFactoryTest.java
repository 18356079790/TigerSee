package com.it.designModel.factoryModel.simpleFactroy;

import com.it.designModel.factoryModel.ICourse;
import com.it.designModel.factoryModel.JavaCourse;
import com.it.designModel.factoryModel.PythonCourse;

/**
 * 测试简单工厂
 */
public class SimpleFactoryTest {

    public static void main(String[] args)
    {
        System.out.println("简单工厂测试...");
        ICourseFactory factory = new ICourseFactory();
        ICourse course0 = factory.createCourse(JavaCourse.class);
        course0.record();

        ICourse course1 = factory.createCourse(PythonCourse.class);
        course1.record();
    }
}
