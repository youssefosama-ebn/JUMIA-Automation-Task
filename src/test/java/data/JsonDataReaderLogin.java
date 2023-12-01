package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReaderLogin
{

	public String email,password;
	public void JsonReader() throws FileNotFoundException, IOException, ParseException
	{
		String filepath=System.getProperty("user.dir")+"/src/test/java/data/UserLoginData.json";
		File srcfile=new File(filepath);
		JSONParser parser=new JSONParser();
		JSONArray jarray=(JSONArray)parser.parse(new FileReader(srcfile));
		for(Object jsonobj: jarray)

		{
			JSONObject person=(JSONObject)jsonobj;
			email=(String)person.get("email");
			password=(String)person.get("password");


		}
	}
}
