package com.mustafa.designpatterns.creationalPatterns.factoryPattern.service;

import com.mustafa.designpatterns.creationalPatterns.factoryPattern.service.base.IFileExporter;

class PdfExporter implements IFileExporter {
    @Override
    public String export(String content) {
        return "PDF -> " + content;
    }
}
