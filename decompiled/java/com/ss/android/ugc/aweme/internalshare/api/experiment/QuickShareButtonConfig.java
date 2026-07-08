package com.ss.android.ugc.aweme.internalshare.api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class QuickShareButtonConfig {

    @C09CT("enable_like_trigger")
    public final int enableLikeTrigger;

    @C09CT("enable_loop_trigger")
    public final int enableLoopTrigger;

    @C09CT("enable_playtime_trigger")
    public final int enablePlayTimeTrigger;

    @C09CT("enable_repost_trigger")
    public final int enableRepostTrigger;

    @C09CT("play_loop_trigger")
    public final int playLoopTrigger;

    @C09CT("play_time_trigger")
    public final int playTimeTrigger;

    @C09CT("repost_trigger_delay")
    public final long repostTriggerDelay;

    @C09CT("reverse_external_share")
    public final int reverseExternalShare;

    @C09CT("reverse_internal_share")
    public final int reverseInternalShare;

    public QuickShareButtonConfig() {
        this(0, 0, 0, 1, 16000, 0, 0, 0, 500L);
    }

    public QuickShareButtonConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        this.enableLikeTrigger = i;
        this.enableLoopTrigger = i2;
        this.enablePlayTimeTrigger = i3;
        this.playLoopTrigger = i4;
        this.playTimeTrigger = i5;
        this.reverseExternalShare = i6;
        this.reverseInternalShare = i7;
        this.enableRepostTrigger = i8;
        this.repostTriggerDelay = j;
    }
}
