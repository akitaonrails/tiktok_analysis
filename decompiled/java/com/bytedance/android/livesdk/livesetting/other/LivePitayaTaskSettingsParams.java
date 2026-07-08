package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePitayaTaskSettingsParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("task_execution_period")
    public long period;

    static {
        NormalGson.singleton();
        ADAPTER = new LivePitayaTaskSettingsParams_OptTypeAdapter();
    }

    public LivePitayaTaskSettingsParams() {
        this(500L);
    }

    public LivePitayaTaskSettingsParams(long j) {
        this.period = j;
    }
}
