package com.ss.android.ugc.aweme.dsp.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class DspFeedbackConfig {

    @C09CT("ring_buffer_size")
    public final int ringBufferSize = 100;

    @C09CT("interval")
    public final long interval = 3600000;

    public final long getInterval() {
        return this.interval;
    }

    public final int getRingBufferSize() {
        return this.ringBufferSize;
    }
}
