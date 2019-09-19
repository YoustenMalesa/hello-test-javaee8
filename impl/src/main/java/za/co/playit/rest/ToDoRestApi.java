package za.co.playit.rest;

import za.co.playit.todo.api.ToDoService;
import za.co.playit.todo.entity.ToDo;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("todo")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class ToDoRestApi {
    @EJB
    private ToDoService toDoService;

    @Path("add")
    @POST
    public Response createToDo(ToDo toDo) {
        toDoService.addToDO(toDo);
        return Response.ok(toDo).build();
    }

    @Path("update")
    @PUT
    public Response updateToDo(ToDo toDo) {
        toDoService.updateToDo(toDo);
        return Response.ok(toDo).build();
    }

    @Path("all")
    @POST
    public Response getAllToDos() {
        List<ToDo> toDos = toDoService.getAllToDos();
        return Response.ok(toDos).build();
    }

    @Path("{id}")
    @GET
    public Response getToDoById(@PathParam("id") Long id) {
        return Response.ok(toDoService.getToDoById(id)).build();
    }

    @Path("complete/{id}")
    @GET
    public Response markToDoAsComplete(@PathParam("id") Long id) {
        return Response.ok(toDoService.markToDoAsCompleted(id)).build();
    }

}