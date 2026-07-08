package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkMicMixStreamAudioParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("aacProfile")
    public String aacProfile;

    @C09CT("bitRate")
    public int bitRate;

    @C09CT("channels")
    public int channels;

    @C09CT("sampleRate")
    public int sampleRate;

    static {
        NormalGson.singleton();
        ADAPTER = new LinkMicMixStreamAudioParams_OptTypeAdapter();
    }

    public LinkMicMixStreamAudioParams() {
        this(-1, -1, -1, "");
    }

    public LinkMicMixStreamAudioParams(int i, int i2, int i3, String str) {
        this.bitRate = i;
        this.sampleRate = i2;
        this.channels = i3;
        this.aacProfile = str;
    }
}
