package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkMicMixStreamVideoParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("codec")
    public String codec;

    @C09CT("fps")
    public int fps;

    @C09CT("gop")
    public int gop;

    static {
        NormalGson.singleton();
        ADAPTER = new LinkMicMixStreamVideoParams_OptTypeAdapter();
    }

    public LinkMicMixStreamVideoParams() {
        this("", -1, -1);
    }

    public LinkMicMixStreamVideoParams(String str, int i, int i2) {
        this.codec = str;
        this.fps = i;
        this.gop = i2;
    }
}
