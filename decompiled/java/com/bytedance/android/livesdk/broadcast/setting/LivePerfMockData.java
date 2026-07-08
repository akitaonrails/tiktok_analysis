package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePerfMockData {
    public static final TypeAdapter ADAPTER = new LivePerfMockData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("encode_fps")
    public double encodeFps;

    @C09CT("overall_score")
    public double overallScore;

    @C09CT("perf_score")
    public int perfScore;

    public LivePerfMockData() {
        this(false, 20, 6.5d, 30.0d);
    }

    public LivePerfMockData(boolean z, int i, double d, double d2) {
        this.enable = z;
        this.perfScore = i;
        this.overallScore = d;
        this.encodeFps = d2;
    }
}
