package HomeWork4;

public class Task {
	private static Integer id;
	private String currentDate;
	private String currentTime;
	private String nameTask;
	private String fio;
	private String dateDedline;
	private Priority priority;

	static {
		id = 0;
	}

	Task(String currentDate, String currentTime, String nameTask, String fio, String dateDedline, Priority priority) {
		id++;
		this.currentDate = currentDate;
		this.currentTime = currentTime;
		this.nameTask = nameTask;
		this.fio = fio;
		this.dateDedline = dateDedline;
		this.priority = priority;
	}

	public int getId(){
		return id;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public String getCurrentTime(){
		return currentTime;
	}

	public String getNameTask(){
		return nameTask;
	}

	public String getFio(){
		return fio;
	}

	public String getDateDedline(){
		return dateDedline;
	}

	public Priority getPriority(){
		return priority;
	}
}
