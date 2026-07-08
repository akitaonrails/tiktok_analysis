package com.ss.android.ugc.aweme.profile.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class AccountLabelType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AccountLabelType[] $VALUES;
    public final int value;
    public static final AccountLabelType SCM = new AccountLabelType("SCM", 0, 1);
    public static final AccountLabelType AGS_WARNING = new AccountLabelType("AGS_WARNING", 1, 2);
    public static final AccountLabelType HONOR_LABEL_VERIFICATION = new AccountLabelType("HONOR_LABEL_VERIFICATION", 2, 3);

    public static final /* synthetic */ AccountLabelType[] $values() {
        return new AccountLabelType[]{SCM, AGS_WARNING, HONOR_LABEL_VERIFICATION};
    }

    public static InterfaceC2044707zh<AccountLabelType> getEntries() {
        return $ENTRIES;
    }

    static {
        AccountLabelType[] accountLabelTypeArr$values = $values();
        $VALUES = accountLabelTypeArr$values;
        $ENTRIES = new C2254308sP(accountLabelTypeArr$values);
    }

    public static AccountLabelType[] values() {
        return (AccountLabelType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AccountLabelType valueOf(String str) {
        return (AccountLabelType) C08FF.LIZ(AccountLabelType.class, str);
    }

    public AccountLabelType(String str, int i, int i2) {
        this.value = i2;
    }
}
