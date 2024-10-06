package org.aster.infra.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.aster.infra.entities.TaskEntity;

@ApplicationScoped
public class TaskRepository implements PanacheRepository<TaskEntity> {
}
