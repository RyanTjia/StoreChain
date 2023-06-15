package Services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileServices {

	final String RESOURCEDIR = new File("").getAbsolutePath() + "/src/resources/templates/";

	public String returnStaticHTML(String fileHTML) {
		String html = "Error! :(";

		try {
			File selectedFile = new File(RESOURCEDIR, fileHTML);

			Scanner fileReader = new Scanner(selectedFile);
			html = "";

			while (fileReader.hasNextLine()) {
				html += fileReader.nextLine();
			}

			fileReader.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return html;
	}
}