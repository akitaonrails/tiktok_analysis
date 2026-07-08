package com.ss.android.ugc.aweme.services.draft;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class MigrateType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MigrateType[] $VALUES;
    public static final MigrateType AUTO = new MigrateType("AUTO", 0);
    public static final MigrateType MANUAL = new MigrateType("MANUAL", 1);

    public static final /* synthetic */ MigrateType[] $values() {
        return new MigrateType[]{AUTO, MANUAL};
    }

    public static InterfaceC2044707zh<MigrateType> getEntries() {
        return $ENTRIES;
    }

    static {
        MigrateType[] migrateTypeArr$values = $values();
        $VALUES = migrateTypeArr$values;
        $ENTRIES = new C2254308sP(migrateTypeArr$values);
    }

    public static MigrateType[] values() {
        return (MigrateType[]) $VALUES.clone();
    }

    public static MigrateType valueOf(String str) {
        return (MigrateType) C08FF.LIZ(MigrateType.class, str);
    }

    public MigrateType(String str, int i) {
    }
}
