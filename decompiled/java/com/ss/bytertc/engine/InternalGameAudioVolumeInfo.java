package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes36.dex */
public class InternalGameAudioVolumeInfo {
    public String userId;
    public int volume;

    public InternalGameAudioVolumeInfo(String str, int i) {
        this.userId = str;
        this.volume = i;
    }

    public static InternalGameAudioVolumeInfo create(String str, int i) {
        return new InternalGameAudioVolumeInfo(str, i);
    }
}
