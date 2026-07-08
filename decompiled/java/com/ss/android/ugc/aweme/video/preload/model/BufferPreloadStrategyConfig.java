package com.ss.android.ugc.aweme.video.preload.model;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class BufferPreloadStrategyConfig {

    @C09CT("buffer_threshold_list")
    public final BufferThreshold[] bufferThresholdList;

    @C09CT("progress_callback_cnt_limit")
    public final int progressCallbackCntLimit;

    @C09CT("strategy")
    public final int strategy;

    public BufferPreloadStrategyConfig(int i, BufferThreshold[] bufferThresholdArr, int i2) {
        this.strategy = i;
        this.bufferThresholdList = bufferThresholdArr;
        this.progressCallbackCntLimit = i2;
    }
}
