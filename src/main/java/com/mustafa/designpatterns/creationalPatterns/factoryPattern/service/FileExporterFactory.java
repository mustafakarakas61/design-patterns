package com.mustafa.designpatterns.creationalPatterns.factoryPattern.service;

import com.mustafa.designpatterns.creationalPatterns.factoryPattern.enm.FileType;
import com.mustafa.designpatterns.creationalPatterns.factoryPattern.service.base.IFileExporter;

public class FileExporterFactory {
    public static IFileExporter getInstance(FileType fileType) {
        switch (fileType) {
            case EXCEL: return new ExcelExporter();
            case PDF: return new PdfExporter();
            default: throw new UnsupportedOperationException();
        }
    }

}
