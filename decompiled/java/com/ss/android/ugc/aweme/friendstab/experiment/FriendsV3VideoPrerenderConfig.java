package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class FriendsV3VideoPrerenderConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("fast_scroll_dy_threshold_dp")
    public final int fastScrollDyThresholdDp;

    @C09CT("low_buffer_action")
    public final int lowBufferAction;

    @C09CT("max_photo_skip_distance")
    public final int maxPhotoSkipDistance;

    @C09CT("skip_fast_scroll")
    public final boolean skipFastScroll;

    @C09CT("video_load_threshold")
    public final int videoLoadThreshold;

    public FriendsV3VideoPrerenderConfig() {
        this(false, 30, false, 70, 0, -1);
    }

    public FriendsV3VideoPrerenderConfig(boolean z, int i, boolean z2, int i2, int i3, int i4) {
        this.enable = z;
        this.videoLoadThreshold = i;
        this.skipFastScroll = z2;
        this.fastScrollDyThresholdDp = i2;
        this.lowBufferAction = i3;
        this.maxPhotoSkipDistance = i4;
    }
}
