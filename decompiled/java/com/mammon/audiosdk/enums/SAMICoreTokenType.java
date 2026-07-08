package com.mammon.audiosdk.enums;

import X.C08FF;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public enum SAMICoreTokenType {
    TOKEN_TO_B(0),
    TOKEN_TO_C_D(1),
    TOKEN_TO_B_MIXED(2);

    public static final HashMap<Integer, SAMICoreTokenType> intToEnumMap = new HashMap<>();
    public int value;

    static {
        for (SAMICoreTokenType sAMICoreTokenType : values()) {
            intToEnumMap.put(Integer.valueOf(sAMICoreTokenType.getValue()), sAMICoreTokenType);
        }
    }

    public int getValue() {
        return this.value;
    }

    public static SAMICoreTokenType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public static SAMICoreTokenType valueOf(String str) {
        return (SAMICoreTokenType) C08FF.LIZ(SAMICoreTokenType.class, str);
    }

    SAMICoreTokenType(int i) {
        this.value = i;
    }
}
