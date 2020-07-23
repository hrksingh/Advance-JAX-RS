package atrium.rest;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/count")
@Singleton
public class CountController {
	
	private int count = 0;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response counter() {
		count = count+1;
		String str = "Connter called "+count+ " times";
		return Response.status(200).entity(str).build();
	}
}
