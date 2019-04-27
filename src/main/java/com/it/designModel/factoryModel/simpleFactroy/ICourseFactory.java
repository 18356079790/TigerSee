package com.it.designModel.factoryModel.simpleFactroy;

import com.it.designModel.factoryModel.ICourse;
import com.it.designModel.factoryModel.JavaCourse;
import com.it.designModel.factoryModel.PythonCourse;

/**
 * 简单工厂，没有遵循单一原则，也没有遵循开闭原则
 */
public class ICourseFactory {

    //这里如果clz的种类比较多，就会有很长的if else;
    //这里的代码也会经常修改，不符合开闭原则;
    //这里创建的对象的种类页较多，不符合单一原则;
    public ICourse createCourse(Class clz)
    {
        if(clz == JavaCourse.class)
        {
            return new JavaCourse();
        }
        else if(clz == PythonCourse.class)
        {
            return new PythonCourse();
        }
        return null;
    }

}
