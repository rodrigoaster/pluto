package org.aster.domain.services;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.aster.app.dto.TaskDTO;
import org.aster.domain.entities.TaskEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class TaskServiceTest {
    @Inject
    TaskService taskService;

    @Test
    @DisplayName("Should be create a new Task.")
    void shouldBeCreateNewTask() {
        TaskDTO taskCreated = new TaskDTO();
        taskCreated.setTitle("Task title");
        taskCreated.setDescription("Task Description");

        TaskEntity sut = taskService.createTask(taskCreated);

        Assertions.assertEquals(taskCreated.getTitle(), sut.getTitle());
        Assertions.assertEquals(taskCreated.getDescription(), sut.getDescription());
    }
}
