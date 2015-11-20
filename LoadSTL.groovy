import java.nio.file.Paths;
import eu.mihosoft.vrl.v3d.FileUtil;
import com.neuronrobotics.bowlerstudio.vitamins.*;

// Load an STL file from a git repo
// Loading a local file also works here
File servoFile = ScriptingEngine.fileFromGit(
	"https://github.com/NeuronRobotics/BowlerStudioVitamins.git",
	"BowlerStudioVitamins/stl/servo/smallservo.stl");
// Load the .CSG from the disk and cache it in memory
CSG servo  = Vitamins.get(servoFile);

FileUtil.write(Paths.get(servoFile.getAbsolutePath()+"_new.stl"),
		servo.toStlString());
return servo;