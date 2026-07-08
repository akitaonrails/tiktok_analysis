package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class CurrencyCodeTimeoutConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("group")
    public int group;

    @C09CT("timeout_ms")
    public long timeoutMs;

    static {
        NormalGson.singleton();
        ADAPTER = new CurrencyCodeTimeoutConfig_OptTypeAdapter();
    }

    public CurrencyCodeTimeoutConfig() {
        this(0, 1000L);
    }

    public CurrencyCodeTimeoutConfig(int i, long j) {
        this.group = i;
        this.timeoutMs = j;
    }
}
