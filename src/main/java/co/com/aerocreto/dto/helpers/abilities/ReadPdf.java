package co.com.aerocreto.dto.helpers.abilities;

import co.com.aerocreto.dto.util.Constants;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

import java.io.File;
import java.io.IOException;

import static co.com.aerocreto.dto.helpers.hooks.DeletePdfFiles.isAStatement;

public class ReadPdf implements Ability {
    private String pdfText;
    private final String filePath;
    PdfReader pdfReader;

    public ReadPdf(String filePath) throws IOException {
        this.filePath = filePath;
        this.pdfReader = new PdfReader(filePath);
    }

    public static ReadPdf downloadedInPath(String filePath) throws IOException {
        return new ReadPdf(filePath);
    }

    public static ReadPdf as(Actor actor) {
        return actor.abilityTo(ReadPdf.class);
    }

    public String getText() {
/**
 int pagesNumber = pdfReader.getNumberOfPages();
 StringBuilder pdfText = new StringBuilder();
 for (int i = 1; i <= pagesNumber; i++) {
 pdfText.append(PdfTextExtractor.getTextFromPage(pdfReader, i));
 }
 */
        File downloadsDirectory = new File(Constants.FOLDER_MAQUINA);
        for (File file : downloadsDirectory.listFiles()) {
            if (isAStatement(file.getName())) {
                pdfText = file.getName();
            }
        }
        return pdfText;
    }

}
