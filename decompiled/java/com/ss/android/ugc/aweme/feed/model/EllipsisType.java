package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class EllipsisType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EllipsisType[] $VALUES;
    public static final EllipsisType END = new EllipsisType("END", 0);
    public static final EllipsisType MIDDLE = new EllipsisType("MIDDLE", 1);
    public static final EllipsisType START = new EllipsisType("START", 2);

    public static final /* synthetic */ EllipsisType[] $values() {
        return new EllipsisType[]{END, MIDDLE, START};
    }

    public static InterfaceC2044707zh<EllipsisType> getEntries() {
        return $ENTRIES;
    }

    static {
        EllipsisType[] ellipsisTypeArr$values = $values();
        $VALUES = ellipsisTypeArr$values;
        $ENTRIES = new C2254308sP(ellipsisTypeArr$values);
    }

    public static EllipsisType[] values() {
        return (EllipsisType[]) $VALUES.clone();
    }

    public static EllipsisType valueOf(String str) {
        return (EllipsisType) C08FF.LIZ(EllipsisType.class, str);
    }

    public EllipsisType(String str, int i) {
    }
}
