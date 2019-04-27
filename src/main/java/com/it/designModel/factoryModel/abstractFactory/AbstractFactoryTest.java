package com.it.designModel.factoryModel.abstractFactory;

import com.it.designModel.factoryModel.ICourse;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        ICourseFactory javaFactory = new JavaCourseFactory();
        ICourse javaCourse = javaFactory.createCourse();
        INote javaNote = javaFactory.createNote();
        IVideo javaVideo = javaFactory.createVideo();
        javaCourse.record();
        javaNote.note();
        javaVideo.video();

        System.out.println("------------------------------");

        ICourseFactory pythonFactory = new PythonCourseFactory();
        ICourse pythonCourse = pythonFactory.createCourse();
        INote pythonNote = pythonFactory.createNote();
        IVideo pythonVideo = pythonFactory.createVideo();
        pythonCourse.record();
        pythonNote.note();
        pythonVideo.video();
    }
}
