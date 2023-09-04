package com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.factories;

import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.shapes.rounded.RoundedRectangle;
import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.shapes.rounded.RoundedSquare;
import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.base.AbstractFactory;
import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.base.IShape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public IShape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        } else {
            return null;
        }
    }
}
