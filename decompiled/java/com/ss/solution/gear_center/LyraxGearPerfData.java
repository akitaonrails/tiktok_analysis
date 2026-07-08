package com.ss.solution.gear_center;

/* JADX INFO: loaded from: classes36.dex */
public final class LyraxGearPerfData {
    public final int charging;
    public final float cpuRate;
    public final float deviceOverallScore;
    public final float perfScore;
    public final float thermalScore;
    public final float videoRecordScore;

    public LyraxGearPerfData() {
        this(-1, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f);
    }

    public final int getCharging() {
        return this.charging;
    }

    public final float getCpuRate() {
        return this.cpuRate;
    }

    public final float getDeviceOverallScore() {
        return this.deviceOverallScore;
    }

    public final float getPerfScore() {
        return this.perfScore;
    }

    public final float getThermalScore() {
        return this.thermalScore;
    }

    public final float getVideoRecordScore() {
        return this.videoRecordScore;
    }

    public LyraxGearPerfData(int i, float f, float f2, float f3, float f4, float f5) {
        this.charging = i;
        this.thermalScore = f;
        this.videoRecordScore = f2;
        this.deviceOverallScore = f3;
        this.cpuRate = f4;
        this.perfScore = f5;
    }
}
