package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class FloatWindowData {
    public static final TypeAdapter ADAPTER;

    @C09CT("delay_time_in_seconds")
    public int delayTimeInSeconds;

    static {
        NormalGson.singleton();
        ADAPTER = new FloatWindowData_OptTypeAdapter();
    }

    public FloatWindowData() {
        this(5);
    }

    public final int getDelayTimeInSeconds() {
        return this.delayTimeInSeconds;
    }

    public FloatWindowData(int i) {
        this.delayTimeInSeconds = i;
    }

    public final void setDelayTimeInSeconds(int i) {
        this.delayTimeInSeconds = i;
    }
}
