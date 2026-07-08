package com.ss.lyrax.audio;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioPlayerConfig {
    public boolean autoPlay;
    public long callbackOnProgressInterval;
    public int playCount;
    public int startPos;
    public boolean syncProgressToRecordFrame;
    public LyraxAudioMixingType type;

    public LyraxAudioPlayerConfig() {
        this.playCount = 1;
        this.autoPlay = true;
        this.type = LyraxAudioMixingType.PLAYOUT_AND_PUBLISH;
    }

    public long getCallbackOnProgressInterval() {
        return this.callbackOnProgressInterval;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public int getStartPos() {
        return this.startPos;
    }

    public LyraxAudioMixingType getType() {
        return this.type;
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    public boolean isSyncProgressToRecordFrame() {
        return this.syncProgressToRecordFrame;
    }

    public LyraxAudioPlayerConfig(LyraxAudioMixingType lyraxAudioMixingType, int i, int i2, boolean z, long j, boolean z2) {
        this.playCount = 1;
        this.autoPlay = true;
        this.type = lyraxAudioMixingType;
        this.playCount = i;
        this.startPos = i2;
        this.autoPlay = z;
        this.syncProgressToRecordFrame = z2;
        this.callbackOnProgressInterval = j;
    }
}
