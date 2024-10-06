package org.aster.domain.services;

import io.quarkus.test.InjectMock;
import io.quarkus.test.Mock;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.aster.domain.models.TaskModel;
import org.aster.infra.TaskPanacheController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@QuarkusTest
public class TaskServiceTest {
    @Inject
    TaskService taskService;

    @InjectMock
    TaskPanacheController taskPanacheController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Should be create a new Task.")
    void shouldBeCreateNewTask() {
        TaskModel taskCreated = new TaskModel();
        taskCreated.setTitle("Task title");
        taskCreated.setDescription("Task Description");

        TaskModel sut = taskService.createTask(taskCreated);

        assertEquals(taskCreated.getTitle(), sut.getTitle());
        assertEquals(taskCreated.getDescription(), sut.getDescription());
        verify(taskPanacheController, times(1)).createTask(any(TaskModel.class));
    }
}
