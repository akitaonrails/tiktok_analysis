package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class TrimConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("keep_count")
    public int keepCount;

    @C09CT("threshold")
    public int threshold;

    static {
        NormalGson.singleton();
        ADAPTER = new TrimConfig_OptTypeAdapter();
    }

    public TrimConfig() {
        this(100, 20);
    }

    public TrimConfig(int i, int i2) {
        this.threshold = i;
        this.keepCount = i2;
    }
}
