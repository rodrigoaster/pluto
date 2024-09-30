package org.aster.domain.ports.out;

import org.aster.app.dto.TaskDTO;
import org.aster.domain.entities.TaskEntity;

public interface TaskOutgoing {
    TaskEntity createTask(TaskDTO taskDTO);
}
