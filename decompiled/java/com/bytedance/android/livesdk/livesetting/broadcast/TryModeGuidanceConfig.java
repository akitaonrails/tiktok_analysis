package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes36.dex */
public final class TryModeGuidanceConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("brightness_detect_interval")
    public long brightnessDetectInterval;

    @C09CT("brightness_detect_number")
    public int brightnessDetectNumber;

    @C09CT("brightness_detect_threshold")
    public long brightnessDetectThreshold;

    @C09CT("enhanced_bubble_delay")
    public long enhancedBubbleDelay;

    @C09CT("face_detect_delay_duration")
    public int faceDetectDelayDuration;

    @C09CT("face_guidance_delay")
    public long faceGuidanceDelay;

    @C09CT("guidance_interval")
    public long guidanceInterval;

    @C09CT("guidance_show_duration")
    public long guidanceShowDuration;

    @C09CT("volume_detect_interval")
    public long volumeDetectInterval;

    @C09CT("volume_detect_number")
    public int volumeDetectNumber;

    @C09CT("volume_threshold")
    public int volumeThreshold;

    static {
        NormalGson.singleton();
        ADAPTER = new TryModeGuidanceConfig_OptTypeAdapter();
    }

    public TryModeGuidanceConfig() {
        this(100, 6, 500L, 33L, 3, 3, 3000L, Mp4ScreenVideoLoadTimeout.CONTROL, 15000L, Mp4ScreenVideoLoadTimeout.CONTROL, 3000L);
    }

    public final long getBrightnessDetectInterval() {
        return this.brightnessDetectInterval;
    }

    public final int getBrightnessDetectNumber() {
        return this.brightnessDetectNumber;
    }

    public final long getBrightnessDetectThreshold() {
        return this.brightnessDetectThreshold;
    }

    public final long getEnhancedBubbleDelay() {
        return this.enhancedBubbleDelay;
    }

    public final int getFaceDetectDelayDuration() {
        return this.faceDetectDelayDuration;
    }

    public final long getFaceGuidanceDelay() {
        return this.faceGuidanceDelay;
    }

    public final long getGuidanceInterval() {
        return this.guidanceInterval;
    }

    public final long getGuidanceShowDuration() {
        return this.guidanceShowDuration;
    }

    public final long getVolumeDetectInterval() {
        return this.volumeDetectInterval;
    }

    public final int getVolumeDetectNumber() {
        return this.volumeDetectNumber;
    }

    public final int getVolumeThreshold() {
        return this.volumeThreshold;
    }

    public final void setBrightnessDetectInterval(long j) {
        this.brightnessDetectInterval = j;
    }

    public final void setBrightnessDetectNumber(int i) {
        this.brightnessDetectNumber = i;
    }

    public final void setBrightnessDetectThreshold(long j) {
        this.brightnessDetectThreshold = j;
    }

    public final void setEnhancedBubbleDelay(long j) {
        this.enhancedBubbleDelay = j;
    }

    public final void setFaceDetectDelayDuration(int i) {
        this.faceDetectDelayDuration = i;
    }

    public final void setFaceGuidanceDelay(long j) {
        this.faceGuidanceDelay = j;
    }

    public final void setGuidanceInterval(long j) {
        this.guidanceInterval = j;
    }

    public final void setGuidanceShowDuration(long j) {
        this.guidanceShowDuration = j;
    }

    public final void setVolumeDetectInterval(long j) {
        this.volumeDetectInterval = j;
    }

    public final void setVolumeDetectNumber(int i) {
        this.volumeDetectNumber = i;
    }

    public final void setVolumeThreshold(int i) {
        this.volumeThreshold = i;
    }

    public TryModeGuidanceConfig(int i, int i2, long j, long j2, int i3, int i4, long j3, long j4, long j5, long j6, long j7) {
        this.faceDetectDelayDuration = i;
        this.brightnessDetectNumber = i2;
        this.brightnessDetectInterval = j;
        this.brightnessDetectThreshold = j2;
        this.volumeThreshold = i3;
        this.volumeDetectNumber = i4;
        this.volumeDetectInterval = j3;
        this.faceGuidanceDelay = j4;
        this.guidanceInterval = j5;
        this.guidanceShowDuration = j6;
        this.enhancedBubbleDelay = j7;
    }
}
