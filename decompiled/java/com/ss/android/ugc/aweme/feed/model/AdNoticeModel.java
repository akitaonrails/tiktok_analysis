package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class AdNoticeModel implements Serializable {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg = "";

    @C09CT("subscription_status")
    public final int subscriptionStatus;

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final int getSubscriptionStatus() {
        return this.subscriptionStatus;
    }
}
