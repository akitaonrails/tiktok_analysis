package com.ss.ugc.live.sdk.message.interfaces;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class IMListenerType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ IMListenerType[] $VALUES;
    public static final IMListenerType ASYNC = new IMListenerType("ASYNC", 0);
    public static final IMListenerType SYNC = new IMListenerType("SYNC", 1);

    public static final /* synthetic */ IMListenerType[] $values() {
        return new IMListenerType[]{ASYNC, SYNC};
    }

    public static InterfaceC2044707zh<IMListenerType> getEntries() {
        return $ENTRIES;
    }

    static {
        IMListenerType[] iMListenerTypeArr$values = $values();
        $VALUES = iMListenerTypeArr$values;
        $ENTRIES = new C2254308sP(iMListenerTypeArr$values);
    }

    public static IMListenerType[] values() {
        return (IMListenerType[]) $VALUES.clone();
    }

    public static IMListenerType valueOf(String str) {
        return (IMListenerType) C08FF.LIZ(IMListenerType.class, str);
    }

    public IMListenerType(String str, int i) {
    }
}
