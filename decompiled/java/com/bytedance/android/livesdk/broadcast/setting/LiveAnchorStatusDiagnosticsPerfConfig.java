package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveAnchorStatusDiagnosticsPerfConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("cpu_bad")
    public double cpuBad;

    @C09CT("cpu_warning")
    public double cpuWarning;

    @C09CT("gpu_bad")
    public double gpuBad;

    @C09CT("gpu_warning")
    public double gpuWarning;

    @C09CT("mem_bad")
    public int memBad;

    @C09CT("mem_warning")
    public int memWarning;

    @C09CT("sustain_duration_s")
    public int sustainDurationS;

    @C09CT("temperature_bad")
    public double temperatureBad;

    @C09CT("temperature_warning")
    public double temperatureWarning;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveAnchorStatusDiagnosticsPerfConfig_OptTypeAdapter();
    }

    public LiveAnchorStatusDiagnosticsPerfConfig() {
        this(0.4d, 0.7d, 0.5d, 0.8d, 2000, 500, 40.0d, 43.0d, 15);
    }

    public final double getCpuBad() {
        return this.cpuBad;
    }

    public final double getCpuWarning() {
        return this.cpuWarning;
    }

    public final double getGpuBad() {
        return this.gpuBad;
    }

    public final double getGpuWarning() {
        return this.gpuWarning;
    }

    public final int getMemBad() {
        return this.memBad;
    }

    public final int getMemWarning() {
        return this.memWarning;
    }

    public final int getSustainDurationS() {
        return this.sustainDurationS;
    }

    public final double getTemperatureBad() {
        return this.temperatureBad;
    }

    public final double getTemperatureWarning() {
        return this.temperatureWarning;
    }

    public final void setCpuBad(double d) {
        this.cpuBad = d;
    }

    public final void setCpuWarning(double d) {
        this.cpuWarning = d;
    }

    public final void setGpuBad(double d) {
        this.gpuBad = d;
    }

    public final void setGpuWarning(double d) {
        this.gpuWarning = d;
    }

    public final void setMemBad(int i) {
        this.memBad = i;
    }

    public final void setMemWarning(int i) {
        this.memWarning = i;
    }

    public final void setSustainDurationS(int i) {
        this.sustainDurationS = i;
    }

    public final void setTemperatureBad(double d) {
        this.temperatureBad = d;
    }

    public final void setTemperatureWarning(double d) {
        this.temperatureWarning = d;
    }

    public LiveAnchorStatusDiagnosticsPerfConfig(double d, double d2, double d3, double d4, int i, int i2, double d5, double d6, int i3) {
        this.cpuWarning = d;
        this.cpuBad = d2;
        this.gpuWarning = d3;
        this.gpuBad = d4;
        this.memWarning = i;
        this.memBad = i2;
        this.temperatureWarning = d5;
        this.temperatureBad = d6;
        this.sustainDurationS = i3;
    }
}
