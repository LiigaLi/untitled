package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WordGenerator {
    public static void main(String[] args) throws IOException {
        //Blank Document
        Faker faker = new Faker();
        XWPFDocument document = new XWPFDocument();

        //Write the Document in file system
        FileOutputStream out = new FileOutputStream( new File("LIGA.docx"));
        document.write(out);
        out.close();
        System.out.println("createdocument.docx written successully");

        //create Paragraph
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(faker.shakespeare().hamletQuote());

        document.write(out);
        out.close();
        System.out.println("createparagraph.docx written successfully");

    }
}
