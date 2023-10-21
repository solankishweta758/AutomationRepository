package qsp;

import org.openqa.selenium.edge.EdgeDriver;


public class LaunchEdgeBrowser {

	public static void main(String[] args) {
	
		// to launch Edge browser we need to create obj of EdgeDrive();
		new EdgeDriver();
		System.out.println("edge is open");
	}

}
