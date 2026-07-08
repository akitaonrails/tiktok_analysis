package com.bytedance.android.livesdk.livesetting.slot;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GeckoContent {
    public static final TypeAdapter ADAPTER;

    @C09CT("gecko_channel")
    public String geckoChannel;

    @C09CT("msg_type")
    public int msgType;

    @C09CT("ribbon_file_name")
    public String ribbonFileName;

    @C09CT("animation_video_file_name")
    public String videoFileName;

    static {
        NormalGson.singleton();
        ADAPTER = new GeckoContent_OptTypeAdapter();
    }

    public GeckoContent() {
        this(0, null, null, null);
    }

    public GeckoContent(int i, String str, String str2, String str3) {
        this.msgType = i;
        this.ribbonFileName = str;
        this.videoFileName = str2;
        this.geckoChannel = str3;
    }
}
