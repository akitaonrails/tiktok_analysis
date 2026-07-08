package com.ss.android.ugc.effectmanager.common.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes31.dex */
public final class FetchModelType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ FetchModelType[] $VALUES;
    public static final FetchModelType ORIGIN = new FetchModelType("ORIGIN", 0);
    public static final FetchModelType ZIP = new FetchModelType("ZIP", 1);

    public static final /* synthetic */ FetchModelType[] $values() {
        return new FetchModelType[]{ORIGIN, ZIP};
    }

    public static InterfaceC2044707zh<FetchModelType> getEntries() {
        return $ENTRIES;
    }

    static {
        FetchModelType[] fetchModelTypeArr$values = $values();
        $VALUES = fetchModelTypeArr$values;
        $ENTRIES = new C2254308sP(fetchModelTypeArr$values);
    }

    public static FetchModelType[] values() {
        return (FetchModelType[]) $VALUES.clone();
    }

    public static FetchModelType valueOf(String str) {
        return (FetchModelType) C08FF.LIZ(FetchModelType.class, str);
    }

    public FetchModelType fromValue(int i) {
        for (FetchModelType fetchModelType : values()) {
            if (fetchModelType.ordinal() == i) {
                return fetchModelType;
            }
        }
        return ORIGIN;
    }

    public FetchModelType(String str, int i) {
    }
}
