package com.example.mapstruct.model.entity;

import com.example.mapstruct.model.DataDto;
import com.example.mapstruct.model.mapper.DataDtoToDataEntityMapper;

public abstract class DataDtoToDataEntityMapperDecorator extends AbstractMapperDecorator<DataDtoToDataEntityMapper>
        implements DataDtoToDataEntityMapper {

    // Decorator 를 사용한 Data Control.
    @Override
    public void toDataEntity(DataDto dataDto, Data data) {
        delegate().toDataEntity(dataDto, data);
        data.setDecoratorType("HARD");
    }
}
