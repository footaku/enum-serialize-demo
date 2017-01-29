package com.example.panage.config;

import com.example.panage.model.Flag;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author panage
 */
@Configuration
public class JsonConfiguration {
    /**
     * JSON<->Enum間の変換Moduleを登録します
     * @return {@link ObjectMapper}
     */
    @Bean
    public ObjectMapper jsonObjectMapper(MessageSource messageSource) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(generateFlagModule());
        return mapper;
    }

    private Module generateFlagModule() {
        SimpleModule simpleModule = new SimpleModule();
        simpleModule
                .addSerializer(Flag.class, new FlagSerializer())
                .addDeserializer(Flag.class, new FlagDeserializer());
        return simpleModule;
    }
}
