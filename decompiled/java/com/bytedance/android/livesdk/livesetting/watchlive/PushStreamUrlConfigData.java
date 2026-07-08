package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class PushStreamUrlConfigData {
    public static final TypeAdapter ADAPTER;
    public static final PushStreamUrlConfigData LIZ = new PushStreamUrlConfigData();

    @C09CT("cache_size")
    public int cacheSize = 10;

    @C09CT("expire_time")
    public int expireTime = 86400;

    static {
        NormalGson.singleton();
        ADAPTER = new PushStreamUrlConfigData_OptTypeAdapter();
    }
}
