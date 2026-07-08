package com.bytedance.android.starship.engine.reasoning.define;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class EngineUploadConfig implements Serializable {

    @C09CT("run_sample_rate")
    public float runSampleRate;

    @C09CT("skip_run_times")
    public int skipRunTimesReport;

    public EngineUploadConfig() {
        this(0.0f, 0);
    }

    public final void setRunSampleRate(float f) {
        this.runSampleRate = f;
    }

    public final void setSkipRunTimesReport(int i) {
        this.skipRunTimesReport = i;
    }

    public EngineUploadConfig(float f, int i) {
        this.runSampleRate = f;
        this.skipRunTimesReport = i;
    }
}
