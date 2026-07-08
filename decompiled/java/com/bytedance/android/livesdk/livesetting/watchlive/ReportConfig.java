package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class ReportConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("max_count")
    public int maxCount;

    @C09CT("max_day")
    public int maxDay;

    static {
        NormalGson.singleton();
        ADAPTER = new ReportConfig_OptTypeAdapter();
    }

    public ReportConfig() {
        this(5, 30);
    }

    public ReportConfig(int i, int i2) {
        this.maxCount = i;
        this.maxDay = i2;
    }
}
