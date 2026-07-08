package com.ss.android.ugc.aweme.services.draft;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class DraftMigrateState {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ DraftMigrateState[] $VALUES;
    public static final DraftMigrateState NOT_MIGRATE = new DraftMigrateState("NOT_MIGRATE", 0);
    public static final DraftMigrateState MIGRATED = new DraftMigrateState("MIGRATED", 1);
    public static final DraftMigrateState MIGRATED_FAILED = new DraftMigrateState("MIGRATED_FAILED", 2);
    public static final DraftMigrateState MIGRATING = new DraftMigrateState("MIGRATING", 3);
    public static final DraftMigrateState WAIT_MIGRATE = new DraftMigrateState("WAIT_MIGRATE", 4);

    public static final /* synthetic */ DraftMigrateState[] $values() {
        return new DraftMigrateState[]{NOT_MIGRATE, MIGRATED, MIGRATED_FAILED, MIGRATING, WAIT_MIGRATE};
    }

    public static InterfaceC2044707zh<DraftMigrateState> getEntries() {
        return $ENTRIES;
    }

    static {
        DraftMigrateState[] draftMigrateStateArr$values = $values();
        $VALUES = draftMigrateStateArr$values;
        $ENTRIES = new C2254308sP(draftMigrateStateArr$values);
    }

    public static DraftMigrateState[] values() {
        return (DraftMigrateState[]) $VALUES.clone();
    }

    public static DraftMigrateState valueOf(String str) {
        return (DraftMigrateState) C08FF.LIZ(DraftMigrateState.class, str);
    }

    public DraftMigrateState(String str, int i) {
    }
}
