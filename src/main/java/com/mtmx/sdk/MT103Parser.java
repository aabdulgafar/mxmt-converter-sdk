package com.mtmx.sdk;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MT103Parser {
    public Map<String, String> parse(String mt103) {
        Map<String, String> fields = new HashMap<>();
        Pattern pattern = Pattern.compile(":(\\d{2}[A-Z]?):(.*?)(?=(\\n:\\d{2}[A-Z]?:|\\n-\\}|$))", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(mt103);
        while (matcher.find()) {
            fields.put(matcher.group(1), matcher.group(2).trim());
        }
        return fields;
    }
}
