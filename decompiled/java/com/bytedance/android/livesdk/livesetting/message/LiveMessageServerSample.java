package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public class LiveMessageServerSample {

    @C09CT("anchor_ratio")
    public LiveMessageSampleType anchorRatio;

    @C09CT("audience_ratio")
    public LiveMessageSampleType audienceRatio;

    public LiveMessageServerSample() {
        this(new LiveMessageSampleType(new LiveMessageSampleRatio(0L, 0L, 0L, 1000L), new LiveMessageSampleRatio(0L, 0L, 0L, 1000L)), new LiveMessageSampleType(new LiveMessageSampleRatio(0L, 0L, 0L, 1000L), new LiveMessageSampleRatio(0L, 0L, 0L, 1000L)));
    }

    public final LiveMessageSampleType getAnchorRatio() {
        return this.anchorRatio;
    }

    public final LiveMessageSampleType getAudienceRatio() {
        return this.audienceRatio;
    }

    public final void setAnchorRatio(LiveMessageSampleType liveMessageSampleType) {
        this.anchorRatio = liveMessageSampleType;
    }

    public final void setAudienceRatio(LiveMessageSampleType liveMessageSampleType) {
        this.audienceRatio = liveMessageSampleType;
    }

    public LiveMessageServerSample(LiveMessageSampleType liveMessageSampleType, LiveMessageSampleType liveMessageSampleType2) {
        this.anchorRatio = liveMessageSampleType;
        this.audienceRatio = liveMessageSampleType2;
    }
}
