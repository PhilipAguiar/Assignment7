import acm.program.*;
import acm.graphics.*;

public class test extends ConsoleProgram {

private FacePamphletProfile profile = new FacePamphletProfile("Phil");
private GImage image4;



	public void run(){
		
		profile.setImage(image4);
		profile.setStatus("fresh");
		profile.addFriend("Jenny");
		profile.addFriend("kobe");
		
		println(profile.toString());
	}

}
