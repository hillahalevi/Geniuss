package service.impl;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import service.IProcessor;
import service.ITestProcessService;

import javax.inject.Inject;
import java.io.File;
import java.io.IOException;


@Service
@Scope()
public class TestProcessServiceImpl implements ITestProcessService {
    @Inject
    private IProcessor processor;

    public void addTest(String filePath) throws IOException {
        PDDocument document = PDDocument.load(new File(filePath));
        if (!document.isEncrypted()) {
            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(document);
            System.out.println("most common word in text:" + processor.process(text));
        }
        document.close();
    }
}
