package com.ss.android.ugc.aweme.creatoredit;

import X.C08FF;
import X.C2254308sP;
import X.C480701u1;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class MTEditStatusEnum {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MTEditStatusEnum[] $VALUES;
    public static final C480701u1 Companion;
    public final int value;
    public static final MTEditStatusEnum MT_EDIT_STATUS_UNKNOWN = new MTEditStatusEnum("MT_EDIT_STATUS_UNKNOWN", 0, 0);
    public static final MTEditStatusEnum MT_EDIT_STATUS_CAN_EDIT = new MTEditStatusEnum("MT_EDIT_STATUS_CAN_EDIT", 1, 1);
    public static final MTEditStatusEnum MT_EDIT_STATUS_UNDER_REVIEW = new MTEditStatusEnum("MT_EDIT_STATUS_UNDER_REVIEW", 2, 2);
    public static final MTEditStatusEnum MT_EDIT_STATUS_NO_REMAINING_COUNT = new MTEditStatusEnum("MT_EDIT_STATUS_NO_REMAINING_COUNT", 3, 3);

    public static final /* synthetic */ MTEditStatusEnum[] $values() {
        return new MTEditStatusEnum[]{MT_EDIT_STATUS_UNKNOWN, MT_EDIT_STATUS_CAN_EDIT, MT_EDIT_STATUS_UNDER_REVIEW, MT_EDIT_STATUS_NO_REMAINING_COUNT};
    }

    public static InterfaceC2044707zh<MTEditStatusEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.01u1] */
    static {
        MTEditStatusEnum[] mTEditStatusEnumArr$values = $values();
        $VALUES = mTEditStatusEnumArr$values;
        $ENTRIES = new C2254308sP(mTEditStatusEnumArr$values);
        Companion = new Object() { // from class: X.01u1
        };
    }

    public static MTEditStatusEnum[] values() {
        return (MTEditStatusEnum[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static MTEditStatusEnum valueOf(String str) {
        return (MTEditStatusEnum) C08FF.LIZ(MTEditStatusEnum.class, str);
    }

    public MTEditStatusEnum(String str, int i, int i2) {
        this.value = i2;
    }
}
