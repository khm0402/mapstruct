package com.example.mapstruct;

import com.example.mapstruct.model.DataDto;
import com.example.mapstruct.model.entity.Data;
import com.example.mapstruct.service.DataConvertService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class TestApplicationRun implements ApplicationRunner {

    @Autowired
    DataConvertService dataConvertService;

    @Override
    public void run(ApplicationArguments args) {
        DataDto dataDto = DataDto.builder()
                .testName("kim")
                .testEmail("xxx@xxx.xxx")
                .testAge(25)
                .testBirth("1231")
                .build();

        log.info("dataDto >> {}", dataDto);

        Data data = dataConvertService.convertData(dataDto);
        log.info("convert data >> {}", data);
    }
}
