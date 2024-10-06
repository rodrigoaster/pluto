package org.aster.app.rest;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.aster.app.dto.response.TaskResponse;
import org.aster.domain.models.TaskModel;
import org.aster.domain.services.TaskService;

@Path("/task")
@Consumes(value = MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)
public class TaskController {
    @Inject
    TaskService taskService;

    @POST
    @Path("/create")
    public Response createTask(TaskModel taskModel) {
        try {
            TaskModel taskCreated = taskService.createTask(taskModel);
            TaskResponse taskResponseApi = new TaskResponse(true, "Task created successfully", taskCreated);
            return Response.status(Response.Status.CREATED).entity(taskResponseApi).build();
        } catch (BadRequestException error) {
            TaskResponse taskResponseApi = new TaskResponse(false, "Failed to create task", null);
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(taskResponseApi).build();
        }
    }
}
