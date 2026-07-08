package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DowngradeSettings {
    public static final TypeAdapter ADAPTER;

    @C09CT("min_memory")
    public long minMemory;

    static {
        NormalGson.singleton();
        ADAPTER = new DowngradeSettings_OptTypeAdapter();
    }
}
