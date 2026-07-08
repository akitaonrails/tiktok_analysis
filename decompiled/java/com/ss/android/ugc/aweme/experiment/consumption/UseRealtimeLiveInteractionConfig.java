package com.ss.android.ugc.aweme.experiment.consumption;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class UseRealtimeLiveInteractionConfig {

    @C09CT("enable_is_live_comment")
    public final boolean enableIsLiveComment;

    @C09CT("enable_is_live_disliked")
    public final boolean enableIsLiveDisliked;

    @C09CT("enable_is_live_followed")
    public final boolean enableIsLiveFollowed;

    @C09CT("enable_is_live_like")
    public final boolean enableIsLiveLike;

    @C09CT("enable_is_live_reported")
    public final boolean enableIsLiveReported;

    @C09CT("enable_is_live_shared")
    public final boolean enableIsLiveShared;

    public UseRealtimeLiveInteractionConfig() {
        this(false, false, false, false, false, false);
    }

    public UseRealtimeLiveInteractionConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.enableIsLiveFollowed = z;
        this.enableIsLiveShared = z2;
        this.enableIsLiveDisliked = z3;
        this.enableIsLiveReported = z4;
        this.enableIsLiveComment = z5;
        this.enableIsLiveLike = z6;
    }
}
