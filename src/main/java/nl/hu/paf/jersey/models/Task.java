package nl.hu.paf.jersey.models;

public class Task
{
	private boolean done;
	private String description;

	// todo Write constructor, getters + setters

	@Override
	public String toString() {
		return String.format("{\"description\": \"%s\", \"done\": %b}", this.description, this.done);
	}
}
