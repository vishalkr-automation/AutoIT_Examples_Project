package otherActions;

import java.io.IOException;

import org.testng.annotations.Test;

public class TypeText_In_Notepad {
	
	
	@Test
	public void f() throws IOException{
		Runtime.getRuntime().exec(".\\autoITScript\\OpenNotepad.exe");
	}

}
