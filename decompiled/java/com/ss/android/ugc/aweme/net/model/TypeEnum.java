package com.ss.android.ugc.aweme.net.model;

import X.C08FF;
import X.C2254308sP;
import X.C841800X0o;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class TypeEnum {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ TypeEnum[] $VALUES;
    public static final C841800X0o Companion;
    public final int type;
    public static final TypeEnum START_WITH = new TypeEnum("START_WITH", 0, 0);
    public static final TypeEnum CONTAINS = new TypeEnum("CONTAINS", 1, 1);
    public static final TypeEnum REGEX_MATCHES = new TypeEnum("REGEX_MATCHES", 2, 2);
    public static final TypeEnum REGEX_CONTAINS_MATCH_IN = new TypeEnum("REGEX_CONTAINS_MATCH_IN", 3, 3);
    public static final TypeEnum EQUAL = new TypeEnum("EQUAL", 4, 4);

    public static final /* synthetic */ TypeEnum[] $values() {
        return new TypeEnum[]{START_WITH, CONTAINS, REGEX_MATCHES, REGEX_CONTAINS_MATCH_IN, EQUAL};
    }

    public static InterfaceC2044707zh<TypeEnum> getEntries() {
        return $ENTRIES;
    }

    public static final boolean isRegex(int i) {
        Companion.getClass();
        return C841800X0o.LIZ(i);
    }

    static {
        TypeEnum[] typeEnumArr$values = $values();
        $VALUES = typeEnumArr$values;
        $ENTRIES = new C2254308sP(typeEnumArr$values);
        Companion = new C841800X0o();
    }

    public static TypeEnum[] values() {
        return (TypeEnum[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static TypeEnum valueOf(String str) {
        return (TypeEnum) C08FF.LIZ(TypeEnum.class, str);
    }

    public TypeEnum(String str, int i, int i2) {
        this.type = i2;
    }
}
