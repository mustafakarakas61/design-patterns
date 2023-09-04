package com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.factories;

import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.shapes.normal.Rectangle;
import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.shapes.normal.Square;
import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.base.AbstractFactory;
import com.mustafa.designpatterns.creationalPatterns.abstractFactoryPattern.service.base.IShape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public IShape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else {
            return null;
        }
    }
}
