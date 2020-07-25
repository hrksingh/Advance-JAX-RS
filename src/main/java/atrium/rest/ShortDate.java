package atrium.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/shortdate")
public class ShortDate {
	
	@GET
	@Produces("text/shortdate" )
	public Date getDate() {
		
		return Calendar.getInstance().getTime();
	}

}
