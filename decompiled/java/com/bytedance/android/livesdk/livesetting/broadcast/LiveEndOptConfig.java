package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveEndOptConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("enable_live_end_opt")
    public int enableLiveEndOpt;

    @C09CT("live_end_timeout")
    public long liveEndTimeout;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveEndOptConfig_OptTypeAdapter();
    }

    public LiveEndOptConfig() {
        this(0, 500L);
    }

    public LiveEndOptConfig(int i, long j) {
        this.enableLiveEndOpt = i;
        this.liveEndTimeout = j;
    }
}
