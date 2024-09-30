package org.aster.domain.ports.in;

import org.aster.app.dto.TaskDTO;
import org.aster.domain.entities.TaskEntity;

public interface TaskIncoming {
    TaskEntity createTask(TaskDTO taskDTO);
}
