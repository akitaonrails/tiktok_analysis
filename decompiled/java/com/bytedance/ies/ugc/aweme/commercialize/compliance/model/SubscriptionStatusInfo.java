package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class SubscriptionStatusInfo implements Serializable {

    @C09CT("is_canceled")
    public final Boolean isCanceled;

    @C09CT("standard_info")
    public final StandardInfo standardInfo;

    @C09CT("subscription_info")
    public final SubscriptionInfo subscriptionInfo;

    @C09CT("subscription_phase")
    public Integer subscriptionPhase;

    public SubscriptionStatusInfo() {
        this(null, null, Boolean.FALSE, null);
    }

    public final Boolean isCanceled() {
        return this.isCanceled;
    }

    public final void setSubscriptionPhase(Integer num) {
        this.subscriptionPhase = num;
    }

    public SubscriptionStatusInfo(SubscriptionInfo subscriptionInfo, StandardInfo standardInfo, Boolean bool, Integer num) {
        this.subscriptionInfo = subscriptionInfo;
        this.standardInfo = standardInfo;
        this.isCanceled = bool;
        this.subscriptionPhase = num;
    }
}
