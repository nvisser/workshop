package nl.hu.paf.jersey;

import nl.hu.paf.jersey.models.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskMaster
{
	private static List<Task> taskList = new ArrayList<Task>();

	public static void addTask(Task t)
	{
		if (!taskList.contains(t))
		{
			taskList.add(t);
		}
	}

	public static void delTask(Task t)
	{
		if (taskList.contains(t))
		{
			taskList.remove(t);
		}
	}

	public static List<Task> all()
	{
		return taskList;
	}

	public static Task getTask(int id)
	{
		return taskList.get(id);
	}
}
