package com.ss.android.ugc.aweme.video.preload.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class BufferThreshold {

    @C09CT("cache_duration")
    public final int cacheDuration;

    @C09CT("net_speed_factor")
    public final float netSpeedFactor;

    @C09CT("preload_safe_pos_offset")
    public final long preloadSafePosOffset;

    @C09CT("remain_to_start")
    public final long remainToStart;

    @C09CT("remain_to_stop")
    public final long remainToStop;

    @C09CT("video_duration_from")
    public final long videoDurationFrom;

    @C09CT("video_duration_to")
    public final long videoDurationTo;

    public BufferThreshold() {
        this(0L, 0L, 10000L, 15000L, 0L, 15, 3.0f);
    }

    public BufferThreshold(long j, long j2, long j3, long j4, long j5, int i, float f) {
        this.videoDurationFrom = j;
        this.videoDurationTo = j2;
        this.remainToStop = j3;
        this.remainToStart = j4;
        this.preloadSafePosOffset = j5;
        this.cacheDuration = i;
        this.netSpeedFactor = f;
    }
}
