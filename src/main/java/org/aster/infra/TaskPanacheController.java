package org.aster.infra;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.aster.domain.mappers.TaskMapper;
import org.aster.domain.models.TaskModel;
import org.aster.infra.entities.TaskEntity;
import org.aster.infra.repositories.TaskRepository;

@RequestScoped
public class TaskPanacheController {
    @Inject
    TaskRepository taskRepository;

    @Transactional
    public void createTask(TaskModel taskModel) {
        TaskEntity taskEntity = TaskMapper.INSTANCE.mapperModelToEntity(taskModel);

        taskRepository.persist(taskEntity);
    }
}
