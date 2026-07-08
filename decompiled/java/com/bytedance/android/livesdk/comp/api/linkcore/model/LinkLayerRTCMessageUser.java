package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkLayerRTCMessageUser {

    @C09CT("audio_mute")
    public final int audioMute;

    @C09CT("interact_id")
    public final String linkMicId;

    @C09CT("position")
    public final int position;

    @C09CT("video_mute")
    public final int videoMute;

    public LinkLayerRTCMessageUser() {
        this("", -1, 0, 0);
    }

    public LinkLayerRTCMessageUser(String str, int i, int i2, int i3) {
        this.linkMicId = str;
        this.position = i;
        this.audioMute = i2;
        this.videoMute = i3;
    }
}
