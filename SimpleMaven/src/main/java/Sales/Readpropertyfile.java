package Sales;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readpropertyfile {

	Properties pro;

	public Readpropertyfile() {

		File src = new File("C:\\Users\\admin\\git\\SalesforceProject\\SFProject\\TestData\\Config.property");

		try {

			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {

			System.out.println("Exception is present");
		}

	}

	public String getusername() {

		String UN = pro.getProperty("User_name");

		return UN;
	}

	public String PW() {

		String Pass = pro.getProperty("Password");

		return Pass;
	}

	public String URL() {

		String BaseURL = pro.getProperty("BaseURL");

		return BaseURL;
	}
}

