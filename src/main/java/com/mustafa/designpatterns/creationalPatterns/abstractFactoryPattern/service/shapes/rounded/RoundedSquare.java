package com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.shapes.rounded;

import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.base.IShape;

public class RoundedSquare implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
