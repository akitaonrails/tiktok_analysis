package com.ss.android.ugc.aweme.subscription.network.models;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SubscriptionsPreviewSettingsRequest {

    @C09CT("aweme_id")
    public final long awemeId;

    @C09CT("is_preview_on")
    public final boolean isPreviewOn;

    @C09CT("preview_duration")
    public final long previewDuration;

    @C09CT("preview_start_time")
    public final long previewStartTime;

    public SubscriptionsPreviewSettingsRequest() {
        this(false, 0L, 0L, 0L);
    }

    public SubscriptionsPreviewSettingsRequest(boolean z, long j, long j2, long j3) {
        this.isPreviewOn = z;
        this.previewStartTime = j;
        this.previewDuration = j2;
        this.awemeId = j3;
    }
}
