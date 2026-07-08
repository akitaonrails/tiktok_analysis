package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class IconSchema {
    public static final TypeAdapter ADAPTER;

    @C09CT("preload_schema")
    public String preloadSchema;

    static {
        NormalGson.singleton();
        ADAPTER = new IconSchema_OptTypeAdapter();
    }

    public IconSchema() {
        this("https://sf16-va.tiktokcdn.com/obj/eden-va2/logpbybvo/shop.png");
    }

    public final String getPreloadSchema() {
        return this.preloadSchema;
    }

    public IconSchema(String str) {
        this.preloadSchema = str;
    }

    public final void setPreloadSchema(String str) {
        this.preloadSchema = str;
    }
}
