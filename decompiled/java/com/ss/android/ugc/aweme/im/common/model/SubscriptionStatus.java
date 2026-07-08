package com.ss.android.ugc.aweme.im.common.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.C454420Hrs;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class SubscriptionStatus implements Serializable {
    public static final C454420Hrs Companion;
    public static final /* synthetic */ SubscriptionStatus[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;

    @C09CT("3")
    public static final SubscriptionStatus NOT_SUBSCRIBED;

    @C09CT("2")
    public static final SubscriptionStatus SUBSCRIBED_EXPIRED_GRACE_PERIOD;

    @C09CT("1")
    public static final SubscriptionStatus SUBSCRIBED_NOT_EXPIRED;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final SubscriptionStatus UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<SubscriptionStatus> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0Hrs] */
    static {
        SubscriptionStatus subscriptionStatus = new SubscriptionStatus("UNKNOWN", 0, 0);
        UNKNOWN = subscriptionStatus;
        SubscriptionStatus subscriptionStatus2 = new SubscriptionStatus("SUBSCRIBED_NOT_EXPIRED", 1, 1);
        SUBSCRIBED_NOT_EXPIRED = subscriptionStatus2;
        SubscriptionStatus subscriptionStatus3 = new SubscriptionStatus("SUBSCRIBED_EXPIRED_GRACE_PERIOD", 2, 2);
        SUBSCRIBED_EXPIRED_GRACE_PERIOD = subscriptionStatus3;
        SubscriptionStatus subscriptionStatus4 = new SubscriptionStatus("NOT_SUBSCRIBED", 3, 3);
        NOT_SUBSCRIBED = subscriptionStatus4;
        SubscriptionStatus[] subscriptionStatusArr = {subscriptionStatus, subscriptionStatus2, subscriptionStatus3, subscriptionStatus4};
        LLILLJJLI = subscriptionStatusArr;
        LLILLL = new C2254308sP(subscriptionStatusArr);
        Companion = new Object() { // from class: X.0Hrs
        };
    }

    public static SubscriptionStatus[] values() {
        return (SubscriptionStatus[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static SubscriptionStatus valueOf(String str) {
        return (SubscriptionStatus) C08FF.LIZ(SubscriptionStatus.class, str);
    }

    public SubscriptionStatus(String str, int i, int i2) {
        this.LL = i2;
    }
}
