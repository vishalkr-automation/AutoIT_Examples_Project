package otherActions;

import java.io.IOException;

import org.testng.annotations.Test;

public class CloseWindows {
	//Ref by - Vikas Thange  - https://www.youtube.com/watch?v=r-ty40QqVXc&list=PL5UbgrlC4caboU1um0IgAYIxQ22Zqqfox
	//AutoIT is written in VB Script Programming
	
	@Test
	public void f() throws IOException{
		Runtime.getRuntime().exec(".\\autoITScript\\CloseWindows.exe");
	}

}
