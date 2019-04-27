package com.it.designModel.factoryModel.factoryMethod;

import com.it.designModel.factoryModel.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args)
    {
       System.out.println("工厂方法测试...");
       ICourseFactory factory = new JavaCourseFactory();
       ICourse course0 = factory.createCourse();
       course0.record();

       ICourseFactory factory1 = new PythonCourseFactory();
       ICourse course1 = factory1.createCourse();
       course1.record();
    }
}
