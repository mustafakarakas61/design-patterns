package com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern;

import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.FactoryProducer;
import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.base.AbstractFactory;
import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.base.IShape;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        // Shape Factory çağıralım
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        // Shape Factory'den bir REACTANGLE objesi oluşturup draw metodunu çağırarım
        IShape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        IShape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);

        IShape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();

        IShape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();
    }
}
