package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMessageSEITimeoutConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("bias")
    public long bias;

    @C09CT("max_timeout")
    public long maxTimeout;

    @C09CT("multiple")
    public float multiple;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveMessageSEITimeoutConfig_OptTypeAdapter();
    }

    public LiveMessageSEITimeoutConfig() {
        this(1.0f, 0L, 8000L);
    }

    public LiveMessageSEITimeoutConfig(float f, long j, long j2) {
        this.multiple = f;
        this.bias = j;
        this.maxTimeout = j2;
    }
}
