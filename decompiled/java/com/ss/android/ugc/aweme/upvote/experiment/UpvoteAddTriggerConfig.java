package com.ss.android.ugc.aweme.upvote.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class UpvoteAddTriggerConfig {

    @C09CT("group")
    public final int group;

    @C09CT("guide_repost_when_liked_limits")
    public final int likeTimes;

    @C09CT("guide_repost_when_video_complete_times")
    public final int videoLoopTimes;

    public UpvoteAddTriggerConfig() {
        this(0, 0, 0);
    }

    public UpvoteAddTriggerConfig(int i, int i2, int i3) {
        this.group = i;
        this.videoLoopTimes = i2;
        this.likeTimes = i3;
    }
}
