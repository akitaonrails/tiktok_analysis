package com.mammon.audiosdk.enums;

import X.C08FF;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public enum SAMICoreHttpPayloadType {
    None(0),
    JsonString(1),
    StyleConversion(2);

    public static final HashMap<Integer, SAMICoreHttpPayloadType> intToEnumMap = new HashMap<>();
    public int value;

    static {
        for (SAMICoreHttpPayloadType sAMICoreHttpPayloadType : values()) {
            intToEnumMap.put(Integer.valueOf(sAMICoreHttpPayloadType.getValue()), sAMICoreHttpPayloadType);
        }
    }

    public int getValue() {
        return this.value;
    }

    public static SAMICoreHttpPayloadType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public static SAMICoreHttpPayloadType valueOf(String str) {
        return (SAMICoreHttpPayloadType) C08FF.LIZ(SAMICoreHttpPayloadType.class, str);
    }

    SAMICoreHttpPayloadType(int i) {
        this.value = i;
    }
}
