package nl.hu.paf.jersey.requests;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TaskRequest
{
	@XmlElement public String description;
}