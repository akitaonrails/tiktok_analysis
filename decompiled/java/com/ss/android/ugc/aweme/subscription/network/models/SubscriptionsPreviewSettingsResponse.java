package com.ss.android.ugc.aweme.subscription.network.models;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SubscriptionsPreviewSettingsResponse {

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMessage;

    public SubscriptionsPreviewSettingsResponse() {
        this(0, "");
    }

    public SubscriptionsPreviewSettingsResponse(int i, String str) {
        this.statusCode = i;
        this.statusMessage = str;
    }
}
