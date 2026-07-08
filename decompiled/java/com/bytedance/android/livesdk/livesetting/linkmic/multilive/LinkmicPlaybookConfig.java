package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LinkmicPlaybookConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("retry_interval")
    public int retryInterval;

    static {
        NormalGson.singleton();
        ADAPTER = new LinkmicPlaybookConfig_OptTypeAdapter();
    }

    public LinkmicPlaybookConfig() {
        this(3);
    }

    public LinkmicPlaybookConfig(int i) {
        this.retryInterval = i;
    }
}
