package com.bytedance.sdk.xbridge.registry.core.model.idl;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes35.dex */
public final class XDynamicType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ XDynamicType[] $VALUES;
    public static final XDynamicType Null = new XDynamicType("Null", 0);
    public static final XDynamicType Boolean = new XDynamicType("Boolean", 1);
    public static final XDynamicType Int = new XDynamicType("Int", 2);
    public static final XDynamicType Number = new XDynamicType("Number", 3);
    public static final XDynamicType String = new XDynamicType("String", 4);
    public static final XDynamicType Map = new XDynamicType("Map", 5);
    public static final XDynamicType Array = new XDynamicType("Array", 6);
    public static final XDynamicType Long = new XDynamicType("Long", 7);
    public static final XDynamicType ByteArray = new XDynamicType("ByteArray", 8);

    public static final /* synthetic */ XDynamicType[] $values() {
        return new XDynamicType[]{Null, Boolean, Int, Number, String, Map, Array, Long, ByteArray};
    }

    public static InterfaceC2044707zh<XDynamicType> getEntries() {
        return $ENTRIES;
    }

    static {
        XDynamicType[] xDynamicTypeArr$values = $values();
        $VALUES = xDynamicTypeArr$values;
        $ENTRIES = new C2254308sP(xDynamicTypeArr$values);
    }

    public static XDynamicType[] values() {
        return (XDynamicType[]) $VALUES.clone();
    }

    public static XDynamicType valueOf(String str) {
        return (XDynamicType) C08FF.LIZ(XDynamicType.class, str);
    }

    public XDynamicType(String str, int i) {
    }
}
