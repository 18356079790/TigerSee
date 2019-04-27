package com.it.designModel.factoryModel.abstractFactory;

import com.it.designModel.factoryModel.ICourse;
import com.it.designModel.factoryModel.JavaCourse;

/**
 * 定义java产品组
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
