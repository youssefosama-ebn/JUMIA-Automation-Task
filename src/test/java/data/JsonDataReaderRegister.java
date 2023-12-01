package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReaderRegister 
{
	public String mobilenumber,password,confirmpassword,firstname,lastname,email,date,otp;
	public void JsonReader() throws FileNotFoundException, IOException, ParseException
	{
		String filepath=System.getProperty("user.dir")+"/src/test/java/data/UserRegistrationData.json";
		File srcfile=new File(filepath);
		JSONParser parser=new JSONParser();
		JSONArray jarray=(JSONArray)parser.parse(new FileReader(srcfile));
		for(Object jsonobj: jarray)
			
		{
			JSONObject person=(JSONObject)jsonobj;
			mobilenumber=(String)person.get("mobilenumber");
			password=(String)person.get("password");
			confirmpassword=(String)person.get("confirmpassword");
			firstname=(String)person.get("firstname");
			lastname=(String)person.get("lastname");
			email=(String)person.get("email");
			date=(String)person.get("date");
			otp=(String)person.get("otp");



			
			
			
		}
		
	
	}
	

}
