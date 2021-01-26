package com.example.mapstruct.model.mapper;

import com.example.mapstruct.model.DataDto;
import com.example.mapstruct.model.entity.Data;
import com.example.mapstruct.model.entity.DataDtoToDataEntityMapperDecorator;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.WARN)
@DecoratedWith(DataDtoToDataEntityMapperDecorator.class)
public interface DataDtoToDataEntityMapper {

    // source: 인자로 받은 dto 객체. target: 리턴 대상인 entity 객체.
    @Mapping(source = "testName", target = "name")
    @Mapping(source = "testEmail", target = "email")
    @Mapping(source = "testBirth", target = "birth")
    @Mapping(source = "testAge", target = "age")
    void toDataEntity(DataDto dataDto, @MappingTarget Data data);

}
