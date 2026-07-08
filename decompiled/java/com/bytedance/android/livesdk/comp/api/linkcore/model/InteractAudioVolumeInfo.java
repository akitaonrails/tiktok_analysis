package com.bytedance.android.livesdk.comp.api.linkcore.model;

/* JADX INFO: loaded from: classes16.dex */
public final class InteractAudioVolumeInfo {
    public final boolean isTalk;
    public final String linkMicId;
    public final int volume;

    public final boolean isTalk() {
        return this.isTalk;
    }

    public InteractAudioVolumeInfo(String str, boolean z, int i) {
        this.linkMicId = str;
        this.isTalk = z;
        this.volume = i;
    }
}
