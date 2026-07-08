package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class TNCRequestConf {
    public static final TypeAdapter ADAPTER = new TNCRequestConf_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enable;

    @C09CT("timeout_ms")
    public int timeoutMs;

    public TNCRequestConf() {
        this(false, 200);
    }

    public TNCRequestConf(boolean z, int i) {
        this.enable = z;
        this.timeoutMs = i;
    }
}
