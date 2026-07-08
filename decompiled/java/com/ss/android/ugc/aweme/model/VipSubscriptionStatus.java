package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class VipSubscriptionStatus {
    public static final /* synthetic */ VipSubscriptionStatus[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT("1")
    public static final VipSubscriptionStatus SUBSCRIPTION_STATUS_ACTIVE;

    @C09CT("2")
    public static final VipSubscriptionStatus SUBSCRIPTION_STATUS_CANCELLED;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final VipSubscriptionStatus SUBSCRIPTION_STATUS_EMPTY;

    @C09CT("3")
    public static final VipSubscriptionStatus SUBSCRIPTION_STATUS_EXPIRED;

    public static InterfaceC2044707zh<VipSubscriptionStatus> getEntries() {
        return LLILLJJLI;
    }

    static {
        VipSubscriptionStatus vipSubscriptionStatus = new VipSubscriptionStatus("SUBSCRIPTION_STATUS_EMPTY", 0);
        SUBSCRIPTION_STATUS_EMPTY = vipSubscriptionStatus;
        VipSubscriptionStatus vipSubscriptionStatus2 = new VipSubscriptionStatus("SUBSCRIPTION_STATUS_ACTIVE", 1);
        SUBSCRIPTION_STATUS_ACTIVE = vipSubscriptionStatus2;
        VipSubscriptionStatus vipSubscriptionStatus3 = new VipSubscriptionStatus("SUBSCRIPTION_STATUS_CANCELLED", 2);
        SUBSCRIPTION_STATUS_CANCELLED = vipSubscriptionStatus3;
        VipSubscriptionStatus vipSubscriptionStatus4 = new VipSubscriptionStatus("SUBSCRIPTION_STATUS_EXPIRED", 3);
        SUBSCRIPTION_STATUS_EXPIRED = vipSubscriptionStatus4;
        VipSubscriptionStatus[] vipSubscriptionStatusArr = {vipSubscriptionStatus, vipSubscriptionStatus2, vipSubscriptionStatus3, vipSubscriptionStatus4};
        LL = vipSubscriptionStatusArr;
        LLILLJJLI = new C2254308sP(vipSubscriptionStatusArr);
    }

    public static VipSubscriptionStatus[] values() {
        return (VipSubscriptionStatus[]) LL.clone();
    }

    public static VipSubscriptionStatus valueOf(String str) {
        return (VipSubscriptionStatus) C08FF.LIZ(VipSubscriptionStatus.class, str);
    }

    public VipSubscriptionStatus(String str, int i) {
    }
}
