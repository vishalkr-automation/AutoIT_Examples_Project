package otherActions;

import java.io.IOException;

import org.testng.annotations.Test;

public class OpenNotepadSaveFileUsingSaveMenu {
	//Ref by - Vikas Thange  - https://www.youtube.com/watch?v=r-ty40QqVXc&list=PL5UbgrlC4caboU1um0IgAYIxQ22Zqqfox
	
	@Test
	public void f() throws IOException{
		Runtime.getRuntime().exec(".\\autoITScript\\NotepadFileSaveMenu.exe");
	}

}
