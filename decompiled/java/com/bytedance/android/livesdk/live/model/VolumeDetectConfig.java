package com.bytedance.android.livesdk.live.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class VolumeDetectConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("count_threshold")
    public int countThreshold;

    @C09CT("detect_interval_seconds")
    public int detectIntervalSeconds;

    @C09CT("first_count_down_duration_minutes")
    public int firstCountDownDurationMinutes;

    @C09CT("pause_prompt_duration_minutes")
    public int pausePromptDurationMinutes;

    @C09CT("volume_threshold")
    public int volumeThreshold;

    static {
        NormalGson.singleton();
        ADAPTER = new VolumeDetectConfig_OptTypeAdapter();
    }

    public VolumeDetectConfig() {
        this(3, 3, 3, 3, 3);
    }

    public final int getCountThreshold() {
        return this.countThreshold;
    }

    public final int getDetectIntervalSeconds() {
        return this.detectIntervalSeconds;
    }

    public final int getFirstCountDownDurationMinutes() {
        return this.firstCountDownDurationMinutes;
    }

    public final int getPausePromptDurationMinutes() {
        return this.pausePromptDurationMinutes;
    }

    public final int getVolumeThreshold() {
        return this.volumeThreshold;
    }

    public final void setCountThreshold(int i) {
        this.countThreshold = i;
    }

    public final void setDetectIntervalSeconds(int i) {
        this.detectIntervalSeconds = i;
    }

    public final void setFirstCountDownDurationMinutes(int i) {
        this.firstCountDownDurationMinutes = i;
    }

    public final void setPausePromptDurationMinutes(int i) {
        this.pausePromptDurationMinutes = i;
    }

    public final void setVolumeThreshold(int i) {
        this.volumeThreshold = i;
    }

    public VolumeDetectConfig(int i, int i2, int i3, int i4, int i5) {
        this.firstCountDownDurationMinutes = i;
        this.detectIntervalSeconds = i2;
        this.volumeThreshold = i3;
        this.countThreshold = i4;
        this.pausePromptDurationMinutes = i5;
    }
}
