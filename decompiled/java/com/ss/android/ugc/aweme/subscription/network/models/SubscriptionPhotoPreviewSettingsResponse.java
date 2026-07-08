package com.ss.android.ugc.aweme.subscription.network.models;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class SubscriptionPhotoPreviewSettingsResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMessage;

    public SubscriptionPhotoPreviewSettingsResponse() {
        this(0, "");
    }

    public SubscriptionPhotoPreviewSettingsResponse(Integer num, String str) {
        this.statusCode = num;
        this.statusMessage = str;
    }
}
