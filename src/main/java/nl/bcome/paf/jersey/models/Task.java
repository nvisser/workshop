package nl.bcome.paf.jersey.models;

public class Task
{
	private boolean done;
	private String description;

	public Task(String description)
	{
		this.description = description;
	}

	public boolean isDone()
	{
		return done;
	}

	public void setDone(boolean done)
	{
		this.done = done;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	@Override
	public String toString()
	{
		return "Task{" +
					   "done=" + done +
					   ", description='" + description + '\'' +
					   '}';
	}
}
