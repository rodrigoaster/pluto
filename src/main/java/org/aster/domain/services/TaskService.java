package org.aster.domain.services;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import org.aster.domain.models.TaskModel;
import org.aster.infra.TaskPanacheController;

@RequestScoped
public class TaskService {
    @Inject
    TaskPanacheController taskPanacheController;

    public TaskModel createTask(TaskModel taskModel) {
        this.taskPanacheController.createTask(taskModel);
        return taskModel;
    }
}
