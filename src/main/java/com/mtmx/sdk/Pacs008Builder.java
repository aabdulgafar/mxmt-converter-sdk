package com.mtmx.sdk;

import java.util.Map;

public class Pacs008Builder {
    public String build(Map<String, String> mt103Fields) {
        String amount = mt103Fields.getOrDefault("32A", "250101USD0").substring(9).replace(",", ".");
        String currency = mt103Fields.getOrDefault("32A", "250101USD0").substring(6, 9);
        String reference = mt103Fields.getOrDefault("20", "UNKNOWN");

        return "<Document><CdtTrf><MsgId>" + reference + "</MsgId><Amt Ccy=\"" + currency + "\">" + amount + "</Amt></CdtTrf></Document>";
    }
}
