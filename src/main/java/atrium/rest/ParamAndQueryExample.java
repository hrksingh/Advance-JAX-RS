package atrium.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("{pathParam}/test")
public class ParamAndQueryExample {

	@PathParam(value = "pathParam")
	private String PathParamter;
	@QueryParam(value = "query")
	private String QueryParamter;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response test() {
		String str = "Path Param used is " + PathParamter + " and Query Param is " + QueryParamter;
		return Response.status(200).entity(str).build();
	}
}
