// Load an STL file from a git repo
// Loading a local file also works here
File servoFile = ScriptingEngine.fileFromGit(
	"https://github.com/NeuronRobotics/BowlerStudioVitamins.git",
	"BowlerStudioVitamins/stl/servo/smallservo.stl");
// Load the .CSG from the disk and cache it in memory
CSG servo  = Vitamins.get(servoFile);
String filename =ScriptingEngine.getWorkspace().getAbsolutePath()+"/CopiedStl.stl";
FileUtil.write(Paths.get(filename),
		servo.toStlString());
println "STL EXPORT to "+filename
return servo;