package com.bytedance.android.livesdk.comp.api.subscription.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class PunishmentDataResponse {

    @C09CT("anchor_id")
    public final long anchorId;

    @C09CT("anchor_toast")
    public final String anchorToast;

    @C09CT("app_id")
    public final int appId;

    @C09CT("audience_toast")
    public final String audienceToast;

    public PunishmentDataResponse(long j, String str, String str2, int i) {
        this.anchorId = j;
        this.anchorToast = str;
        this.audienceToast = str2;
        this.appId = i;
    }
}
