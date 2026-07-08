package com.ss.android.ugc.aweme.shortvideo.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class OriginalType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ OriginalType[] $VALUES;
    public final int original;
    public static final OriginalType UPLOAD = new OriginalType("UPLOAD", 0, 0);
    public static final OriginalType SHOOT = new OriginalType("SHOOT", 1, 1);
    public static final OriginalType UPLOAD_AND_SHOOT = new OriginalType("UPLOAD_AND_SHOOT", 2, 2);

    public static final /* synthetic */ OriginalType[] $values() {
        return new OriginalType[]{UPLOAD, SHOOT, UPLOAD_AND_SHOOT};
    }

    public static InterfaceC2044707zh<OriginalType> getEntries() {
        return $ENTRIES;
    }

    static {
        OriginalType[] originalTypeArr$values = $values();
        $VALUES = originalTypeArr$values;
        $ENTRIES = new C2254308sP(originalTypeArr$values);
    }

    public static OriginalType[] values() {
        return (OriginalType[]) $VALUES.clone();
    }

    public final int getOriginal() {
        return this.original;
    }

    public static OriginalType valueOf(String str) {
        return (OriginalType) C08FF.LIZ(OriginalType.class, str);
    }

    public OriginalType(String str, int i, int i2) {
        this.original = i2;
    }
}
