package atrium.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class AppController {

	@GET

	@Produces(MediaType.TEXT_PLAIN)
	public Response sayHello() {

		String str = "Hope its works";

		return Response.status(200).entity(str).build();
	}

}