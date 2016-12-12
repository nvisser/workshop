package nl.hu.paf.jersey;

import nl.hu.paf.jersey.models.Task;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("tasks")
public class Tasks
{
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public String all()
	{
		// Show all tasks
	}

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String create(@FormParam("description") String desc)
	{
		// Make new task with description

		// Add it to the list
		return task.toString();
	}

	@GET
	@Path("done/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String setDone()
	{
		// Get task by id
		Task t = TaskMaster.getTask(id);

		// Set task done

		// What is the indexOf task?
		int location = ...;

		// Replace item in tasklist

		return t.toString();
	}
}
