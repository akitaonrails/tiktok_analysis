package com.bytedance.android.livesdk.comp.api.subscription.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class PunishmentData {
    public final SubscriptionAccess LIZ;

    @C09CT("anchor_id")
    public final long anchorId;

    @C09CT("app_id")
    public final int appId;

    public PunishmentData(long j, SubscriptionAccess subscriptionAccess, SubscriptionAccess subscriptionAccess2, int i) {
        this.anchorId = j;
        this.LIZ = subscriptionAccess;
        this.appId = i;
    }
}
