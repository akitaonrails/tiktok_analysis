package com.ss.bytertc.engine.avclient.sdkparams;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class LyraxAVClientSdkParams {

    @C09CT("enableNoRoom")
    public boolean enableNoRoom;

    @C09CT("video")
    public LyraxAVClientVideoParams videoParams = new LyraxAVClientVideoParams();

    @C09CT("audio")
    public LyraxAVClientAudioParams audioParams = new LyraxAVClientAudioParams();

    @C09CT("customMediaServerIp")
    public String customMediaServerIp = "";

    public final LyraxAVClientAudioParams getAudioParams() {
        return this.audioParams;
    }

    public final String getCustomMediaServerIp() {
        return this.customMediaServerIp;
    }

    public final boolean getEnableNoRoom() {
        return this.enableNoRoom;
    }

    public final LyraxAVClientVideoParams getVideoParams() {
        return this.videoParams;
    }
}
