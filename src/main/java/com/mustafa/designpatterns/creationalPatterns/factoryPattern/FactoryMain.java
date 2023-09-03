package com.mustafa.designpatterns.creationalPatterns.factoryPattern;

import com.mustafa.designpatterns.creationalPatterns.factoryPattern.enm.FileType;
import com.mustafa.designpatterns.creationalPatterns.factoryPattern.service.FileExporterFactory;

public class FactoryMain {
    /**
     * Factory ve interface'ler bilinecek sadece
     */
    public static void main(String[] args) {
        String file = FileExporterFactory.getInstance(FileType.EXCEL).export("Test Content!");
        System.out.println(file);
    }
}
