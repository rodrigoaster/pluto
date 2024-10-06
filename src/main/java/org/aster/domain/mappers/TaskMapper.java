package org.aster.domain.mappers;

import org.aster.domain.models.TaskModel;
import org.aster.infra.entities.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "CDI")
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);
    TaskEntity mapperModelToEntity(TaskModel taskModel);
}
