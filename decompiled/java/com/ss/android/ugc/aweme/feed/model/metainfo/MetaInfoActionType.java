package com.ss.android.ugc.aweme.feed.model.metainfo;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class MetaInfoActionType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MetaInfoActionType[] $VALUES;
    public static final MetaInfoActionType META_ACTION_TYPE_NONE = new MetaInfoActionType("META_ACTION_TYPE_NONE", 0, 0);
    public static final MetaInfoActionType META_ACTION_TYPE_SCHEMA_JUMP = new MetaInfoActionType("META_ACTION_TYPE_SCHEMA_JUMP", 1, 1);
    public final int type;

    public static final /* synthetic */ MetaInfoActionType[] $values() {
        return new MetaInfoActionType[]{META_ACTION_TYPE_NONE, META_ACTION_TYPE_SCHEMA_JUMP};
    }

    public static InterfaceC2044707zh<MetaInfoActionType> getEntries() {
        return $ENTRIES;
    }

    static {
        MetaInfoActionType[] metaInfoActionTypeArr$values = $values();
        $VALUES = metaInfoActionTypeArr$values;
        $ENTRIES = new C2254308sP(metaInfoActionTypeArr$values);
    }

    public static MetaInfoActionType[] values() {
        return (MetaInfoActionType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static MetaInfoActionType valueOf(String str) {
        return (MetaInfoActionType) C08FF.LIZ(MetaInfoActionType.class, str);
    }

    public MetaInfoActionType(String str, int i, int i2) {
        this.type = i2;
    }
}
