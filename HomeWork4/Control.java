package HomeWork4;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Control implements I_Control {

	@Override
	public void run() {
		boolean statusApp = true;
		loadBase();
		while (statusApp) {
			int choice = showMenu();
			switch (choice) {
				case 1 -> addTask();
				case 0 -> {
					System.out.println('0');
					statusApp = false;
				}
				default -> System.out.println("Неверная команда!");
			}
		}

	}

	@Override
	public int showMenu() {
		System.out.println("Выберите действие: ");
		System.out.println("1. Добавить задачу.");
		System.out.println("0. Выйти с программы.");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		return num;
	}

	@Override
	public void addTask() {
		System.out.println("Введите название задачи.");
		Scanner in = new Scanner(System.in);
		String nameTask = in.nextLine();

		System.out.println("Введите ФИО сотрудника.");
		String fio = in.nextLine();

		System.out.println("Введите дату в формате dd.MM.yyyy, до какого числа нужно завершить задачу.");
		String deadline = in.nextLine();

		Date date = new Date();
		SimpleDateFormat formatCurrentDate = new SimpleDateFormat("dd.MM.yyyy");
		String currentDate = formatCurrentDate.format(date);

		SimpleDateFormat formatCurrentTime = new SimpleDateFormat("hh:mm");
		String currentTime = formatCurrentTime.format(date);

		boolean prioritySelection = true;
		while (prioritySelection) {
			int prioritet = showPriority();
			switch (prioritet) {
				case 1 -> {
					Task task = new Task(currentDate, currentTime, nameTask, fio, deadline, Priority.LOW);
					addBase(task);
					prioritySelection = false;
				}

				case 2 -> {
					Task task = new Task(currentDate, currentTime, nameTask, fio, deadline, Priority.MEDIUM);
					addBase(task);
					prioritySelection = false;
				}

				case 3 -> {
					Task task = new Task(currentDate, currentTime, nameTask, fio, deadline, Priority.HIGHTY);
					addBase(task);
					prioritySelection = false;
				}

				default -> System.out.println("Неверная команда!");
			}
		}
	}

	@Override
	public int showPriority() {
		System.out.println("Выберите приоритет срочности: \n1. Низкий.\n2. Средний\n3. Высокий");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		return num;
	}

	@Override
	public void loadBase() {
		File file = new File("HomeWork4/test.csv");

		if (!isFileExists(file)) {
			try (PrintWriter writer = new PrintWriter(new File("HomeWork4/test.csv"))) {
				StringBuilder sb = new StringBuilder();
				sb.append("id");
				sb.append(';');
				sb.append("Дата добавления");
				sb.append(';');
				sb.append("Время добавления");
				sb.append(';');
				sb.append("Название задачи");
				sb.append(';');
				sb.append("ФИО");
				sb.append(';');
				sb.append("Сроки");
				sb.append(';');
				sb.append("Срочность");
				sb.append('\n');

				writer.write(sb.toString());
				writer.close();

			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public void addBase(Task task) {
		try (PrintWriter writer = new PrintWriter(new File("HomeWork4/test.csv"))) {
			StringBuilder sb = new StringBuilder();
			sb.append(task.getId());
			sb.append(';');
			sb.append(task.getCurrentDate());
			sb.append(';');
			sb.append(task.getCurrentTime());
			sb.append(';');
			sb.append(task.getNameTask());
			sb.append(';');
			sb.append(task.getFio());
			sb.append(';');
			sb.append(task.getDateDedline());
			sb.append(';');
			switch (task.getPriority()) {
				case LOW -> sb.append("Низкий");
				case MEDIUM -> sb.append("Средний");
				case HIGHTY -> sb.append("Высокий");
			}
			sb.append('\n');

			writer.print(sb.toString());
			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean isFileExists(File file) {
		return file.exists() && !file.isDirectory();
	}

}
