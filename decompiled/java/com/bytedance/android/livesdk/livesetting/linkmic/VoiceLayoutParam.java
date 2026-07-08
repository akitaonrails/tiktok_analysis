package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceLayoutParam {
    public static final TypeAdapter ADAPTER;

    @C09CT("display_id")
    public int displayId;

    @C09CT("layout_id")
    public String layoutId;

    @C09CT("max_position")
    public int maxPosition;

    @C09CT("percent")
    public float percent;

    static {
        NormalGson.singleton();
        ADAPTER = new VoiceLayoutParam_OptTypeAdapter();
    }

    public VoiceLayoutParam() {
        this(9, "3001", 2, 0.58f);
    }

    public VoiceLayoutParam(int i, String str, int i2, float f) {
        this.maxPosition = i;
        this.layoutId = str;
        this.displayId = i2;
        this.percent = f;
    }
}
