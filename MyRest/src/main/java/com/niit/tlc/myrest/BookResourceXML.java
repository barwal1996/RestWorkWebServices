package com.niit.tlc.myrest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Path("books")
public class BookResourceXML {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{id}")
	
	public Response getALLBooks(@PathParam("id") String bookId)
	{
		Book book = new Book();
		
		book.setId(bookId);
		book.setName("Harry Potter");
		book.setVolumeNumber(1);
		book.setAuthorName("J.K. Rowling");
		return Response.status(200).entity(book).build();
	}
}
