package com.example.panage.config;

import com.example.panage.model.Flag;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @author panage
 */
class FlagSerializer extends JsonSerializer<Flag> {

    @Override
    public void serialize(Flag flag, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        jsonGenerator.writeNumber(flag.getValue());
    }
}
