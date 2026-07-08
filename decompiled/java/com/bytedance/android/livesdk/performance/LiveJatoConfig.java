package com.bytedance.android.livesdk.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveJatoConfig {
    public static final TypeAdapter ADAPTER = new LiveJatoConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("bind_core_enable")
    public boolean bindCoreEnable;

    @C09CT("cpu_boost_enable")
    public boolean cpuBoostEnable;

    @C09CT("debounce_interval_ms")
    public long debounceIntervalMs;

    @C09CT("duration_seconds")
    public int durationSeconds;

    @C09CT("enable")
    public boolean enable;

    @C09CT("gc_enable")
    public boolean gcEnable;

    @C09CT("jit_enable")
    public boolean jitEnable;

    @C09CT("live_page_enable")
    public boolean livePageEnable;

    @C09CT("live_preview_page_enable")
    public boolean livePreviewPageEnable;

    @C09CT("render_thread_enable")
    public boolean renderThreadEnable;

    @C09CT("thread_enable")
    public boolean threadEnable;

    public LiveJatoConfig() {
        this(false, false, false, false, false, false, false, false, false, 3, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public final boolean getBindCoreEnable() {
        return this.bindCoreEnable;
    }

    public final boolean getCpuBoostEnable() {
        return this.cpuBoostEnable;
    }

    public final long getDebounceIntervalMs() {
        return this.debounceIntervalMs;
    }

    public final int getDurationSeconds() {
        return this.durationSeconds;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getGcEnable() {
        return this.gcEnable;
    }

    public final boolean getJitEnable() {
        return this.jitEnable;
    }

    public final boolean getLivePageEnable() {
        return this.livePageEnable;
    }

    public final boolean getLivePreviewPageEnable() {
        return this.livePreviewPageEnable;
    }

    public final boolean getRenderThreadEnable() {
        return this.renderThreadEnable;
    }

    public final boolean getThreadEnable() {
        return this.threadEnable;
    }

    public final void setBindCoreEnable(boolean z) {
        this.bindCoreEnable = z;
    }

    public final void setCpuBoostEnable(boolean z) {
        this.cpuBoostEnable = z;
    }

    public final void setDebounceIntervalMs(long j) {
        this.debounceIntervalMs = j;
    }

    public final void setDurationSeconds(int i) {
        this.durationSeconds = i;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setGcEnable(boolean z) {
        this.gcEnable = z;
    }

    public final void setJitEnable(boolean z) {
        this.jitEnable = z;
    }

    public final void setLivePageEnable(boolean z) {
        this.livePageEnable = z;
    }

    public final void setLivePreviewPageEnable(boolean z) {
        this.livePreviewPageEnable = z;
    }

    public final void setRenderThreadEnable(boolean z) {
        this.renderThreadEnable = z;
    }

    public final void setThreadEnable(boolean z) {
        this.threadEnable = z;
    }

    public LiveJatoConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, long j) {
        this.enable = z;
        this.livePreviewPageEnable = z2;
        this.livePageEnable = z3;
        this.gcEnable = z4;
        this.jitEnable = z5;
        this.cpuBoostEnable = z6;
        this.bindCoreEnable = z7;
        this.renderThreadEnable = z8;
        this.threadEnable = z9;
        this.durationSeconds = i;
        this.debounceIntervalMs = j;
    }
}
