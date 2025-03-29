package com.mtmx.sdk;

public class SwiftConverter {
    public String mt103ToPacs008(String mt103) {
        return "<pacs.008><Converted>From MT103</Converted></pacs.008>";
    }

    public String pacs008ToMt103(String pacs008) {
        return "{1:F01BANKBEBBAXXX0000000000}{2:I103BANKDEFFXXXXN}{4::20:REF123:32A:250327USD10000,00:50K:/12345678\nJOHN DOE-}";
    }
}
