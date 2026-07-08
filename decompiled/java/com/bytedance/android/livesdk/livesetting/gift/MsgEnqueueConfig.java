package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class MsgEnqueueConfig {
    public static final TypeAdapter ADAPTER;
    public static final transient MsgEnqueueConfig LIZ = new MsgEnqueueConfig("time");

    @C09CT("sort_type")
    public String sortType;

    static {
        NormalGson.singleton();
        ADAPTER = new MsgEnqueueConfig_OptTypeAdapter();
    }

    public MsgEnqueueConfig() {
        this("");
    }

    public MsgEnqueueConfig(String str) {
        this.sortType = str;
    }
}
