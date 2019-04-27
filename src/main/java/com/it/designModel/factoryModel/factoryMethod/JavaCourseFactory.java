package com.it.designModel.factoryModel.factoryMethod;

import com.it.designModel.factoryModel.ICourse;
import com.it.designModel.factoryModel.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse()
    {
        return new JavaCourse();
    }
}
