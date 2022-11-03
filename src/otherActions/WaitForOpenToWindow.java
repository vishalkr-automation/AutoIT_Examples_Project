package otherActions;

import java.io.IOException;

import org.testng.annotations.Test;

public class WaitForOpenToWindow {
	
	
	@Test
	public void f() throws IOException{
		Runtime.getRuntime().exec(".\\autoITScript\\WaitToOpenWindow.exe");
	}

}
