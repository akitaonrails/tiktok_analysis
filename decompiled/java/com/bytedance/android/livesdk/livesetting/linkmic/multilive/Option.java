package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class Option {
    public static final TypeAdapter ADAPTER;

    @C09CT("feed_container_resize_ratio")
    public double feedContainerResizeRatio = 0.5625d;

    static {
        NormalGson.singleton();
        ADAPTER = new Option_OptTypeAdapter();
    }
}
