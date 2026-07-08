package com.ss.lyrax.audio;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioStallDetectConfig {
    public boolean enable;
    public int thresholdMs;

    public LyraxAudioStallDetectConfig() {
        this.thresholdMs = 200;
    }

    public LyraxAudioStallDetectConfig(boolean z, int i) {
        this.enable = z;
        this.thresholdMs = i;
    }
}
