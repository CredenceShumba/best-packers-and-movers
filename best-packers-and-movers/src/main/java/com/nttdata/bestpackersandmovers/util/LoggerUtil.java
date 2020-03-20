package com.nttdata.bestpackersandmovers.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author SHUMBC
 *
 */
public class LoggerUtil {

	public static void createPdf(String fileName, String log) {

		Document doc = new Document();

		try {
			//overwrites the files as long as it's closed
			PdfWriter.getInstance(doc, new FileOutputStream(fileName));
			doc.open();
			doc.addTitle(fileName);
			doc.addAuthor("SHUMBC");
			doc.add(new Paragraph(log));
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		} finally {
			doc.close();
		}
	}

}
