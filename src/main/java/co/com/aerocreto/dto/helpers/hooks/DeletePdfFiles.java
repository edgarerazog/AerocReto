package co.com.aerocreto.dto.helpers.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.File;

public class DeletePdfFiles {
    private static final String DOWNLOADED_PDF_FILES_PATH = "/Users/eerazo/Downloads";
    private static final String STATEMENT_FILE_NAME = "https___www.aerocivil.gov.co_atencion_presupuesto_Estados Financieros_Estado de Situación Financiera a 31 de marzo de 2022";

    @Before("@pdf")
    @After("@pdf")
    public static void statementsDownloaded() {

        File downloadsDirectory = new File(DOWNLOADED_PDF_FILES_PATH);

        for (File file : downloadsDirectory.listFiles()) {

            if (isAStatement(file.getName())) {
                file.delete();
            }
        }
    }
    public static boolean isAStatement(String fileName) {

        if (fileName.contains(STATEMENT_FILE_NAME)) {
            return true;
        }
        return false;
    }
}
