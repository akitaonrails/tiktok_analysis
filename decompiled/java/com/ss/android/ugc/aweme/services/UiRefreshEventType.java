package com.ss.android.ugc.aweme.services;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class UiRefreshEventType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ UiRefreshEventType[] $VALUES;
    public static final UiRefreshEventType SHOW_LOADING = new UiRefreshEventType("SHOW_LOADING", 0);
    public static final UiRefreshEventType HIDE_LOADING = new UiRefreshEventType("HIDE_LOADING", 1);
    public static final UiRefreshEventType REFRESH_LIST = new UiRefreshEventType("REFRESH_LIST", 2);

    public static final /* synthetic */ UiRefreshEventType[] $values() {
        return new UiRefreshEventType[]{SHOW_LOADING, HIDE_LOADING, REFRESH_LIST};
    }

    public static InterfaceC2044707zh<UiRefreshEventType> getEntries() {
        return $ENTRIES;
    }

    static {
        UiRefreshEventType[] uiRefreshEventTypeArr$values = $values();
        $VALUES = uiRefreshEventTypeArr$values;
        $ENTRIES = new C2254308sP(uiRefreshEventTypeArr$values);
    }

    public static UiRefreshEventType[] values() {
        return (UiRefreshEventType[]) $VALUES.clone();
    }

    public static UiRefreshEventType valueOf(String str) {
        return (UiRefreshEventType) C08FF.LIZ(UiRefreshEventType.class, str);
    }

    public UiRefreshEventType(String str, int i) {
    }
}
