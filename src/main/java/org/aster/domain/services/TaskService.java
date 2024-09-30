package org.aster.domain.services;

import jakarta.enterprise.context.RequestScoped;
import org.aster.app.dto.TaskDTO;
import org.aster.domain.entities.TaskEntity;

@RequestScoped
public class TaskService {
    public TaskEntity createTask(TaskDTO taskDTO) {
        TaskEntity taskCreated = new TaskEntity();
        taskCreated.setTitle(taskDTO.getTitle());
        taskCreated.setDescription(taskDTO.getDescription());

        return taskCreated;
    }
}
