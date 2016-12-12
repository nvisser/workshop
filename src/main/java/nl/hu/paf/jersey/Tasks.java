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
		// todo Show all tasks
	}

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String create(@FormParam("description") String desc)
	{
		// todo Make new task with description

		// todo Add it to the list

		// Return data
		return task.toString();
	}

	@GET
	@Path("done/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String setDone()
	{
		// todo Get task by id
		Task t = TaskMaster.getTask(id);

		// todo Set task done

		// todo What is the indexOf task?
		int location = ...;

		// todo Replace item in tasklist

		return t.toString();
	}
}
