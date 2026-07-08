package com.ss.android.ugc.aweme.net.model;

import X.C08FF;
import X.C0X1T;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class ScopeEnum {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ScopeEnum[] $VALUES;
    public static final C0X1T Companion;
    public final int scope;
    public static final ScopeEnum ALL = new ScopeEnum("ALL", 0, 0);
    public static final ScopeEnum LOCAL_TEST = new ScopeEnum("LOCAL_TEST", 1, 1);
    public static final ScopeEnum IN_HOUSE = new ScopeEnum("IN_HOUSE", 2, 2);
    public static final ScopeEnum OFFLINE = new ScopeEnum("OFFLINE", 3, 3);
    public static final ScopeEnum ONLINE = new ScopeEnum("ONLINE", 4, 4);

    public static final /* synthetic */ ScopeEnum[] $values() {
        return new ScopeEnum[]{ALL, LOCAL_TEST, IN_HOUSE, OFFLINE, ONLINE};
    }

    public static InterfaceC2044707zh<ScopeEnum> getEntries() {
        return $ENTRIES;
    }

    public static final boolean isValidScope(int i) {
        Companion.getClass();
        return C0X1T.LIZ(i);
    }

    static {
        ScopeEnum[] scopeEnumArr$values = $values();
        $VALUES = scopeEnumArr$values;
        $ENTRIES = new C2254308sP(scopeEnumArr$values);
        Companion = new C0X1T();
    }

    public static ScopeEnum[] values() {
        return (ScopeEnum[]) $VALUES.clone();
    }

    public final int getScope() {
        return this.scope;
    }

    public static ScopeEnum valueOf(String str) {
        return (ScopeEnum) C08FF.LIZ(ScopeEnum.class, str);
    }

    public ScopeEnum(String str, int i, int i2) {
        this.scope = i2;
    }
}
