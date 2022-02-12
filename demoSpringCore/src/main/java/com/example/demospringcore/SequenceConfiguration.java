package com.example.demospringcore;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackageClasses = DemoSpringCoreApplication.class,
        includeFilters = {
                @Filter(
                    type=FilterType.REGEX,
                    pattern = {"com.example.demospringcore.Sequence.*Dao",
                            "com.example.demospringcore.Sequence.*Dto",
                            "com.example.demospringcore.Sequence.*Service"}
            )
        },
        excludeFilters = {
                @Filter(
                        type=FilterType.REGEX,
                        pattern = {"com.example.demospringcore.Sequence.*Dto"}
                )
        }
)
public class SequenceConfiguration {
}
