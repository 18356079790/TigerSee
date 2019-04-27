package com.it.designModel.factoryModel.abstractFactory;

import com.it.designModel.factoryModel.ICourse;

/**
 * 定义产品等级
 */
public interface ICourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
