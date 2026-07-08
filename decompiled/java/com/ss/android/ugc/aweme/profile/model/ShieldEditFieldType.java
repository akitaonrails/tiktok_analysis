package com.ss.android.ugc.aweme.profile.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ShieldEditFieldType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ShieldEditFieldType[] $VALUES;
    public static final ShieldEditFieldType BIO_LINK = new ShieldEditFieldType("BIO_LINK", 0, 1);
    public final int typeValue;

    public static final /* synthetic */ ShieldEditFieldType[] $values() {
        return new ShieldEditFieldType[]{BIO_LINK};
    }

    public static InterfaceC2044707zh<ShieldEditFieldType> getEntries() {
        return $ENTRIES;
    }

    static {
        ShieldEditFieldType[] shieldEditFieldTypeArr$values = $values();
        $VALUES = shieldEditFieldTypeArr$values;
        $ENTRIES = new C2254308sP(shieldEditFieldTypeArr$values);
    }

    public static ShieldEditFieldType[] values() {
        return (ShieldEditFieldType[]) $VALUES.clone();
    }

    public final int getTypeValue() {
        return this.typeValue;
    }

    public static ShieldEditFieldType valueOf(String str) {
        return (ShieldEditFieldType) C08FF.LIZ(ShieldEditFieldType.class, str);
    }

    public ShieldEditFieldType(String str, int i, int i2) {
        this.typeValue = i2;
    }
}
