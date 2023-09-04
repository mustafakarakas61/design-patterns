package com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service;

import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.factories.RoundedShapeFactory;
import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.factories.ShapeFactory;
import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.base.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
