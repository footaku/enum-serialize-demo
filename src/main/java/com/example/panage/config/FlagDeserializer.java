package com.example.panage.config;

import com.example.panage.model.Flag;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

/**
 * @author panage
 */
class FlagDeserializer extends JsonDeserializer<Flag> {

    @Override
    public Flag deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        final int jsonValue = jsonParser.getIntValue();
        return Flag.parse(jsonValue);
    }
}
