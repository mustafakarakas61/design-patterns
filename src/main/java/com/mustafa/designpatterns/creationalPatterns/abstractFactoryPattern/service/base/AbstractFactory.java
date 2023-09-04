package com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.base;

public abstract class AbstractFactory {
    public abstract IShape getShape(String shapeType);
}
