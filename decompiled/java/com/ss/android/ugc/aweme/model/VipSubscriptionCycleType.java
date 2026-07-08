package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C09CT;
import X.C1615040s86;
import X.C1954807lC;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class VipSubscriptionCycleType {
    public static final /* synthetic */ VipSubscriptionCycleType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("1")
    public static final VipSubscriptionCycleType SUBSCRIPTION_CYCLE_TYPE_MONTH;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final VipSubscriptionCycleType SUBSCRIPTION_CYCLE_TYPE_WEEK;
    public final int LL;

    public static InterfaceC2044707zh<VipSubscriptionCycleType> getEntries() {
        return LLILLL;
    }

    static {
        VipSubscriptionCycleType vipSubscriptionCycleType = new VipSubscriptionCycleType("SUBSCRIPTION_CYCLE_TYPE_WEEK", 0, 0);
        SUBSCRIPTION_CYCLE_TYPE_WEEK = vipSubscriptionCycleType;
        VipSubscriptionCycleType vipSubscriptionCycleType2 = new VipSubscriptionCycleType("SUBSCRIPTION_CYCLE_TYPE_MONTH", 1, 1);
        SUBSCRIPTION_CYCLE_TYPE_MONTH = vipSubscriptionCycleType2;
        VipSubscriptionCycleType[] vipSubscriptionCycleTypeArr = {vipSubscriptionCycleType, vipSubscriptionCycleType2};
        LLILLJJLI = vipSubscriptionCycleTypeArr;
        LLILLL = new C2254308sP(vipSubscriptionCycleTypeArr);
    }

    public static VipSubscriptionCycleType[] values() {
        return (VipSubscriptionCycleType[]) LLILLJJLI.clone();
    }

    public final String toCycleString() {
        int i = C1615040s86.LIZ[ordinal()];
        if (i == 1) {
            return "week";
        }
        if (i == 2) {
            return "month";
        }
        throw new C1954807lC();
    }

    public final int getValue() {
        return this.LL;
    }

    public static VipSubscriptionCycleType valueOf(String str) {
        return (VipSubscriptionCycleType) C08FF.LIZ(VipSubscriptionCycleType.class, str);
    }

    public VipSubscriptionCycleType(String str, int i, int i2) {
        this.LL = i2;
    }
}
