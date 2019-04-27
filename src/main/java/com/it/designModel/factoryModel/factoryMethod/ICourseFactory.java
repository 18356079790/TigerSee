package com.it.designModel.factoryModel.factoryMethod;

import com.it.designModel.factoryModel.ICourse;

/**
 * 同简单工厂不同，工厂方法需要定义一个抽象工厂，该工厂不做事，做事的交给具体的子工厂
 * 这样，没有违背单一原则和开闭原则
 * 但是似乎与工厂方法比较多的if else相比，这里的创建的类会很多，每次新增一种产品时，都需要至少新增两个类
 * 而且，相比与简单工厂来说在，增加了代码的复杂度
 *
 *
 */
public interface ICourseFactory {

    ICourse createCourse();
}
