package com.mammon.audiosdk.enums;

import X.C08FF;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public enum SAMICoreAbConfigType {
    UnknownType(0),
    IntType(1),
    FloatType(2),
    StringType(3),
    BoolType(4);

    public static final HashMap<Integer, SAMICoreAbConfigType> intToEnumMap = new HashMap<>();
    public int value;

    static {
        for (SAMICoreAbConfigType sAMICoreAbConfigType : values()) {
            intToEnumMap.put(Integer.valueOf(sAMICoreAbConfigType.getValue()), sAMICoreAbConfigType);
        }
    }

    public int getValue() {
        return this.value;
    }

    public static SAMICoreAbConfigType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public static SAMICoreAbConfigType valueOf(String str) {
        return (SAMICoreAbConfigType) C08FF.LIZ(SAMICoreAbConfigType.class, str);
    }

    SAMICoreAbConfigType(int i) {
        this.value = i;
    }
}
