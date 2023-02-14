package HomeWork4;

import java.io.File;

public interface I_Control {

	public void run();
	public int showMenu();
	public void addTask();
	public int showPriority();
	public void loadBase();
	public boolean isFileExists(File file);

}
