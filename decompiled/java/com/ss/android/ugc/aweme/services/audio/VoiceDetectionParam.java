package com.ss.android.ugc.aweme.services.audio;

/* JADX INFO: loaded from: classes23.dex */
public final class VoiceDetectionParam {
    public String algoModelPath;
    public final String businessType;
    public String creationId;
    public final int detectTime;
    public long downloadModelDuration;
    public long exportDuration;
    public final boolean limitDuration;
    public String musicId;
    public final int sourceType;
    public final double targetThresholds;
    public final long videoDuration;

    public final void setAlgoModelPath(String str) {
        this.algoModelPath = str;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setDownloadModelDuration(long j) {
        this.downloadModelDuration = j;
    }

    public final void setExportDuration(long j) {
        this.exportDuration = j;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public VoiceDetectionParam(int i, String str, double d, boolean z, long j, long j2, int i2, String str2, long j3, String str3, String str4) {
        this.sourceType = i;
        this.businessType = str;
        this.targetThresholds = d;
        this.limitDuration = z;
        this.exportDuration = j;
        this.videoDuration = j2;
        this.detectTime = i2;
        this.algoModelPath = str2;
        this.downloadModelDuration = j3;
        this.creationId = str3;
        this.musicId = str4;
    }
}
