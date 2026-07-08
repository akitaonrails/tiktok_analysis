package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FrequencyConfiguration {
    public static final TypeAdapter ADAPTER;

    @C09CT("control_type")
    public int controlType;

    @C09CT("duration_limit")
    public int durationLimit;

    @C09CT("time_limit")
    public int timeLimit;

    static {
        NormalGson.singleton();
        ADAPTER = new FrequencyConfiguration_OptTypeAdapter();
    }

    public FrequencyConfiguration() {
        this(0, 0, 0);
    }

    public FrequencyConfiguration(int i, int i2, int i3) {
        this.controlType = i;
        this.timeLimit = i2;
        this.durationLimit = i3;
    }
}
