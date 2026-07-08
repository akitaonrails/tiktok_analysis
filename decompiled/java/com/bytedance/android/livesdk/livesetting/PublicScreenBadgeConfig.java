package com.bytedance.android.livesdk.livesetting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PublicScreenBadgeConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("height")
    public int height = 14;

    @C09CT("typography_name")
    public int typographyName = 11;

    static {
        NormalGson.singleton();
        ADAPTER = new PublicScreenBadgeConfig_OptTypeAdapter();
    }
}
