package com.bytedance.lighten.core.config;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: loaded from: classes21.dex */
public final class SRConfig {

    @C09CT("bitmapHeight")
    public int bitmapHeight;

    @C09CT("bitmapWidth")
    public int bitmapWidth;

    @C09CT("optimizeLevel")
    public int optimizeLevel;

    @C09CT("sr_concurrency_limit")
    public int srConcurrencyLimit;

    @C09CT("stageType")
    public int stageType;

    @C09CT("use_jni_sr")
    public boolean useJniSr;

    public SRConfig() {
        this(1, 0, 1440, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, 3, false);
    }

    public final void setBitmapHeight(int i) {
        this.bitmapHeight = i;
    }

    public final void setBitmapWidth(int i) {
        this.bitmapWidth = i;
    }

    public final void setOptimizeLevel(int i) {
        this.optimizeLevel = i;
    }

    public final void setSrConcurrencyLimit(int i) {
        this.srConcurrencyLimit = i;
    }

    public final void setStageType(int i) {
        this.stageType = i;
    }

    public final void setUseJniSr(boolean z) {
        this.useJniSr = z;
    }

    public SRConfig(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.stageType = i;
        this.optimizeLevel = i2;
        this.bitmapWidth = i3;
        this.bitmapHeight = i4;
        this.srConcurrencyLimit = i5;
        this.useJniSr = z;
    }
}
