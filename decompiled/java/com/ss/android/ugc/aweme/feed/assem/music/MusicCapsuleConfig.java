package com.ss.android.ugc.aweme.feed.assem.music;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicCapsuleConfig {

    @C09CT("count")
    public final int count;

    @C09CT("duration")
    public final long duration;

    @C09CT("interval")
    public final long interval;

    @C09CT("left_strategy")
    public final int leftStrategy;

    @C09CT("music_cover_threshold")
    public final float musicCoverThreshold;

    @C09CT("music_shoot_threshold")
    public final float musicShootThreshold;

    @C09CT("right_strategy")
    public final int rightStrategy;

    public MusicCapsuleConfig() {
        this(0, 0, 3L, 3, 259200L, 0.0f, 0.0f);
    }

    public MusicCapsuleConfig(int i, int i2, long j, int i3, long j2, float f, float f2) {
        this.leftStrategy = i;
        this.rightStrategy = i2;
        this.duration = j;
        this.count = i3;
        this.interval = j2;
        this.musicCoverThreshold = f;
        this.musicShootThreshold = f2;
    }
}
