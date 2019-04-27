package com.it.designModel.factoryModel.abstractFactory;

import com.it.designModel.factoryModel.ICourse;
import com.it.designModel.factoryModel.PythonCourse;

public class PythonCourseFactory implements  ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
