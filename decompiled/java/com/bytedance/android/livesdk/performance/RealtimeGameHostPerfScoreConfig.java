package com.bytedance.android.livesdk.performance;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class RealtimeGameHostPerfScoreConfig {
    public static final TypeAdapter ADAPTER = new RealtimeGameHostPerfScoreConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("battery_temp")
    public PerfItemConfig batteryTemperature;

    @C09CT("cpu_speed")
    public PerfItemConfig cpuSpeed;

    @C09CT("drop3")
    public PerfItemConfig drop3;

    @C09CT("effect_render_time")
    public PerfItemConfig effectRenderTime;

    @C09CT("is_enabled")
    public boolean isEnabled;

    @C09CT("level_config")
    public List<Float> levelConfig;

    @C09CT("max_score")
    public float maxScore;

    @C09CT("video_drop_frame")
    public PerfItemConfig videoDropFrame;

    public RealtimeGameHostPerfScoreConfig() {
        this(false, 1.0f, null, null, null, null, null, C1697810uHb.LJIILJJIL(Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.8f), Float.valueOf(0.9f)));
    }

    public final PerfItemConfig getBatteryTemperature() {
        return this.batteryTemperature;
    }

    public final PerfItemConfig getCpuSpeed() {
        return this.cpuSpeed;
    }

    public final PerfItemConfig getDrop3() {
        return this.drop3;
    }

    public final PerfItemConfig getEffectRenderTime() {
        return this.effectRenderTime;
    }

    public final List<Float> getLevelConfig() {
        return this.levelConfig;
    }

    public final float getMaxScore() {
        return this.maxScore;
    }

    public final PerfItemConfig getVideoDropFrame() {
        return this.videoDropFrame;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setBatteryTemperature(PerfItemConfig perfItemConfig) {
        this.batteryTemperature = perfItemConfig;
    }

    public final void setCpuSpeed(PerfItemConfig perfItemConfig) {
        this.cpuSpeed = perfItemConfig;
    }

    public final void setDrop3(PerfItemConfig perfItemConfig) {
        this.drop3 = perfItemConfig;
    }

    public final void setEffectRenderTime(PerfItemConfig perfItemConfig) {
        this.effectRenderTime = perfItemConfig;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setLevelConfig(List<Float> list) {
        this.levelConfig = list;
    }

    public final void setMaxScore(float f) {
        this.maxScore = f;
    }

    public final void setVideoDropFrame(PerfItemConfig perfItemConfig) {
        this.videoDropFrame = perfItemConfig;
    }

    public RealtimeGameHostPerfScoreConfig(boolean z, float f, PerfItemConfig perfItemConfig, PerfItemConfig perfItemConfig2, PerfItemConfig perfItemConfig3, PerfItemConfig perfItemConfig4, PerfItemConfig perfItemConfig5, List<Float> list) {
        this.isEnabled = z;
        this.maxScore = f;
        this.cpuSpeed = perfItemConfig;
        this.drop3 = perfItemConfig2;
        this.videoDropFrame = perfItemConfig3;
        this.effectRenderTime = perfItemConfig4;
        this.batteryTemperature = perfItemConfig5;
        this.levelConfig = list;
    }
}
