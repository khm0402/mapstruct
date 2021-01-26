package com.example.mapstruct.service;

import com.example.mapstruct.model.DataDto;
import com.example.mapstruct.model.entity.Data;
import com.example.mapstruct.model.mapper.DataDtoToDataEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DataConvertService {

    private final DataDtoToDataEntityMapper dataDtoToDataEntityMapper;

    public Data convertData(DataDto dataDto) {
        Data data = new Data();
        dataDtoToDataEntityMapper.toDataEntity(dataDto, data);
        return data;
    }

}
