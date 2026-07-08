package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SkinGiftConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("effect_id")
    public long effectID;

    @C09CT("gift_id")
    public long giftID;

    @C09CT("uri")
    public String uri;

    static {
        NormalGson.singleton();
        ADAPTER = new SkinGiftConfig_OptTypeAdapter();
    }

    public SkinGiftConfig() {
        this(0L, "", 0L);
    }

    public SkinGiftConfig(long j, String str, long j2) {
        this.giftID = j;
        this.uri = str;
        this.effectID = j2;
    }
}
