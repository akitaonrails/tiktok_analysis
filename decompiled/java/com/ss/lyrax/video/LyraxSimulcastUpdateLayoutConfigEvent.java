package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxSimulcastUpdateLayoutConfigEvent extends LyraxPipelineEvent {
    public final boolean hasRtcVideoEncoderConfigs;
    public final boolean hasRtcVideoPerformanceConfig;
    public final LyraxRtcVideoEncoderConfig[] rtcVideoEncoderConfigs;
    public final LyraxRtcVideoPerformanceConfig rtcVideoPerformanceConfig;

    public LyraxRtcVideoEncoderConfig[] getRtcVideoEncoderConfigs() {
        return this.rtcVideoEncoderConfigs;
    }

    public LyraxRtcVideoPerformanceConfig getRtcVideoPerformanceConfig() {
        return this.rtcVideoPerformanceConfig;
    }

    public boolean hasRtcVideoEncoderConfigs() {
        return this.hasRtcVideoEncoderConfigs;
    }

    public boolean hasRtcVideoPerformanceConfig() {
        return this.hasRtcVideoPerformanceConfig;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LyraxSimulcastUpdateLayoutConfigEvent(long j, int i, int i2, LyraxRtcVideoEncoderConfig[] lyraxRtcVideoEncoderConfigArr, LyraxRtcVideoPerformanceConfig lyraxRtcVideoPerformanceConfig) {
        boolean z;
        boolean z2;
        if (lyraxRtcVideoEncoderConfigArr != null) {
            z = true;
        } else {
            z = false;
        }
        if (lyraxRtcVideoPerformanceConfig != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(j, i, i2, z, lyraxRtcVideoEncoderConfigArr, z2, lyraxRtcVideoPerformanceConfig);
    }

    public LyraxSimulcastUpdateLayoutConfigEvent(long j, int i, int i2, boolean z, LyraxRtcVideoEncoderConfig[] lyraxRtcVideoEncoderConfigArr, boolean z2, LyraxRtcVideoPerformanceConfig lyraxRtcVideoPerformanceConfig) {
        super(j, i, i2);
        this.hasRtcVideoEncoderConfigs = z;
        this.rtcVideoEncoderConfigs = z ? lyraxRtcVideoEncoderConfigArr : null;
        this.hasRtcVideoPerformanceConfig = z2;
        this.rtcVideoPerformanceConfig = lyraxRtcVideoPerformanceConfig;
    }

    public static LyraxSimulcastUpdateLayoutConfigEvent create(long j, int i, int i2, boolean z, LyraxRtcVideoEncoderConfig[] lyraxRtcVideoEncoderConfigArr, boolean z2, LyraxRtcVideoPerformanceConfig lyraxRtcVideoPerformanceConfig) {
        return new LyraxSimulcastUpdateLayoutConfigEvent(j, i, i2, z, lyraxRtcVideoEncoderConfigArr, z2, lyraxRtcVideoPerformanceConfig);
    }
}
