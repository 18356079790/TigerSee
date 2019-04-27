package com.it.designModel.factoryModel.factoryMethod;

import com.it.designModel.factoryModel.ICourse;
import com.it.designModel.factoryModel.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }
}
