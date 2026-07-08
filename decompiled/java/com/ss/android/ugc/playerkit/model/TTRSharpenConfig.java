package com.ss.android.ugc.playerkit.model;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class TTRSharpenConfig {

    @C09CT("bitrate_min")
    public int bitrateMinThreshold;

    @C09CT("dur_min")
    public int durationMinThreshold;

    @C09CT("en_grad")
    public boolean enableGradient;

    @C09CT("en_ads")
    public boolean enableInADS;

    @C09CT("en_skip_ff")
    public boolean enableSkipFirstFrame;

    @C09CT("en_vid_sr_mutex")
    public boolean enableVideoSuperResolutionMutex;

    @C09CT("ignore_cnt")
    public int ignoreCount;

    @C09CT("s_min")
    public float sharpnessMin;

    @C09CT("supp_min")
    public float suppressionMin;

    @C09CT("res_min")
    public int resolutionMinThreshold = 540;

    @C09CT("res_max")
    public int resolutionMaxThreshold = 1080;

    @C09CT("s_max")
    public float sharpnessMax = 1.0f;

    @C09CT("supp_max")
    public float suppressionMax = 1.0f;

    @C09CT("res_lim_min")
    public int resolutionLimitationMin = 540;

    @C09CT("res_lim_max")
    public int resolutionLimitationMax = 2160;

    @C09CT("grad")
    public float gradient = 0.1f;

    @C09CT("bitrate_max")
    public int bitrateMaxThreshold = Integer.MAX_VALUE;

    @C09CT("dur_max")
    public int durationMaxThreshold = Integer.MAX_VALUE;

    @C09CT("penetration")
    public int penetrationRate = 100;

    public final int getBitrateMaxThreshold() {
        return this.bitrateMaxThreshold;
    }

    public final int getBitrateMinThreshold() {
        return this.bitrateMinThreshold;
    }

    public final int getDurationMaxThreshold() {
        return this.durationMaxThreshold;
    }

    public final int getDurationMinThreshold() {
        return this.durationMinThreshold;
    }

    public final boolean getEnableGradient() {
        return this.enableGradient;
    }

    public final boolean getEnableInADS() {
        return this.enableInADS;
    }

    public final boolean getEnableSkipFirstFrame() {
        return this.enableSkipFirstFrame;
    }

    public final boolean getEnableVideoSuperResolutionMutex() {
        return this.enableVideoSuperResolutionMutex;
    }

    public final float getGradient() {
        return this.gradient;
    }

    public final int getIgnoreCount() {
        return this.ignoreCount;
    }

    public final int getPenetrationRate() {
        return this.penetrationRate;
    }

    public final int getResolutionLimitationMax() {
        return this.resolutionLimitationMax;
    }

    public final int getResolutionLimitationMin() {
        return this.resolutionLimitationMin;
    }

    public final int getResolutionMaxThreshold() {
        return this.resolutionMaxThreshold;
    }

    public final int getResolutionMinThreshold() {
        return this.resolutionMinThreshold;
    }

    public final float getSharpnessMax() {
        return this.sharpnessMax;
    }

    public final float getSharpnessMin() {
        return this.sharpnessMin;
    }

    public final float getSuppressionMax() {
        return this.suppressionMax;
    }

    public final float getSuppressionMin() {
        return this.suppressionMin;
    }

    public final void setBitrateMaxThreshold(int i) {
        this.bitrateMaxThreshold = i;
    }

    public final void setBitrateMinThreshold(int i) {
        this.bitrateMinThreshold = i;
    }

    public final void setDurationMaxThreshold(int i) {
        this.durationMaxThreshold = i;
    }

    public final void setDurationMinThreshold(int i) {
        this.durationMinThreshold = i;
    }

    public final void setEnableGradient(boolean z) {
        this.enableGradient = z;
    }

    public final void setEnableInADS(boolean z) {
        this.enableInADS = z;
    }

    public final void setEnableSkipFirstFrame(boolean z) {
        this.enableSkipFirstFrame = z;
    }

    public final void setEnableVideoSuperResolutionMutex(boolean z) {
        this.enableVideoSuperResolutionMutex = z;
    }

    public final void setGradient(float f) {
        this.gradient = f;
    }

    public final void setIgnoreCount(int i) {
        this.ignoreCount = i;
    }

    public final void setPenetrationRate(int i) {
        this.penetrationRate = i;
    }

    public final void setResolutionLimitationMax(int i) {
        this.resolutionLimitationMax = i;
    }

    public final void setResolutionLimitationMin(int i) {
        this.resolutionLimitationMin = i;
    }

    public final void setResolutionMaxThreshold(int i) {
        this.resolutionMaxThreshold = i;
    }

    public final void setResolutionMinThreshold(int i) {
        this.resolutionMinThreshold = i;
    }

    public final void setSharpnessMax(float f) {
        this.sharpnessMax = f;
    }

    public final void setSharpnessMin(float f) {
        this.sharpnessMin = f;
    }

    public final void setSuppressionMax(float f) {
        this.suppressionMax = f;
    }

    public final void setSuppressionMin(float f) {
        this.suppressionMin = f;
    }
}
