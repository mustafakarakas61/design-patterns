package com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.shapes.rounded;

import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.base.IShape;

public class RoundedRectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
