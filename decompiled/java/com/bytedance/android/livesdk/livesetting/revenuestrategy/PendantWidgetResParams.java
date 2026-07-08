package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PendantWidgetResParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("channel_name")
    public String channel;

    @C09CT("file_name")
    public String file;

    static {
        NormalGson.singleton();
        ADAPTER = new PendantWidgetResParams_OptTypeAdapter();
    }

    public PendantWidgetResParams() {
        this("", "");
    }

    public PendantWidgetResParams(String str, String str2) {
        this.channel = str;
        this.file = str2;
    }
}
