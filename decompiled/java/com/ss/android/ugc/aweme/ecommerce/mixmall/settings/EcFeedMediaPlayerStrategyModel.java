package com.ss.android.ugc.aweme.ecommerce.mixmall.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class EcFeedMediaPlayerStrategyModel {

    @C09CT("fast_slide_prohibit_play")
    public final int fastSlideProhibitPlay;

    @C09CT("play_position_in_feed")
    public final float playPositionInFeed;

    @C09CT("video_loop")
    public final int videoLoop;

    public EcFeedMediaPlayerStrategyModel() {
        this(-1.0f, -1, 0);
    }

    public EcFeedMediaPlayerStrategyModel(float f, int i, int i2) {
        this.playPositionInFeed = f;
        this.fastSlideProhibitPlay = i;
        this.videoLoop = i2;
    }
}
