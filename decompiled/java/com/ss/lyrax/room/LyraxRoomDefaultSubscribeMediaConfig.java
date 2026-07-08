package com.ss.lyrax.room;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxRoomDefaultSubscribeMediaConfig {
    public boolean subscribeAudio;
    public boolean subscribeVideo;

    public boolean isSubscribeAudio() {
        return this.subscribeAudio;
    }

    public boolean isSubscribeVideo() {
        return this.subscribeVideo;
    }

    public void setSubscribeAudio(boolean z) {
        this.subscribeAudio = z;
    }

    public void setSubscribeVideo(boolean z) {
        this.subscribeVideo = z;
    }

    public LyraxRoomDefaultSubscribeMediaConfig(boolean z, boolean z2) {
        this.subscribeAudio = z;
        this.subscribeVideo = z2;
    }
}
