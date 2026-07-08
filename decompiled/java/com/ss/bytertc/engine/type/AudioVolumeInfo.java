package com.ss.bytertc.engine.type;

import com.ss.bytertc.engine.InternalAudioVolumeInfo;

/* JADX INFO: loaded from: classes36.dex */
public class AudioVolumeInfo {
    public int linearVolume;
    public int nonlinearVolume;
    public String uid;

    public AudioVolumeInfo(InternalAudioVolumeInfo internalAudioVolumeInfo) {
        this.uid = internalAudioVolumeInfo.uid;
        this.nonlinearVolume = internalAudioVolumeInfo.nonlinearVolume;
        this.linearVolume = internalAudioVolumeInfo.linearVolume;
    }

    public AudioVolumeInfo(String str, int i, int i2) {
        this.uid = str;
        this.nonlinearVolume = i;
        this.linearVolume = i2;
    }
}
