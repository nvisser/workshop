package nl.bcome.paf.jersey;

import com.google.gson.Gson;
import nl.bcome.paf.jersey.models.Task;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("tasks")
public class Tasks
{
	private static Gson g = new Gson();

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public String all()
	{
		// Show all
		return TaskMaster.all().toString();
	}

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String create(@FormParam("description") String desc)
	{
		// Make new task
		Task newTask = new Task(desc);

		// Add it to the list
		TaskMaster.addTask(newTask);
		return newTask.toString();
	}

	@GET
	@Path("done/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String setDone(@PathParam("id") int id)
	{
		// Get task
		Task t = TaskMaster.getTask(id);
		// Set done
		t.setDone(true);

		// Where is it?
		int location = TaskMaster.all().indexOf(t);

		// Update in list
		TaskMaster.all().set(location, t);
		return t.toString();
	}
}
