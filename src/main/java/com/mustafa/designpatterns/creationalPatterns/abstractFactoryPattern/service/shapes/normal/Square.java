package com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.shapes.normal;

import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.base.IShape;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
