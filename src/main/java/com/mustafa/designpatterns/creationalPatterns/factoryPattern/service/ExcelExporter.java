package com.mustafa.designpatterns.creationalPatterns.factoryPattern.service;

import com.mustafa.designpatterns.creationalPatterns.factoryPattern.service.base.IFileExporter;

class ExcelExporter implements IFileExporter {
    @Override
    public String export(String content) {
        return "Excel -> " + content;
    }
}
