import run.TerrainTest;
import run.TerrainTestAdvanced;
import io.FileUtils;

//Just a small main class for our render tests
public class Main{
	public static void main(String[] args){
		System.out.println("Starting Renderer.");
		
		//go directly to terrain test
		TerrainTest.run();
		//TerrainTestAdvanced.run();
	}
}
