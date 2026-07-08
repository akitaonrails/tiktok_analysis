package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class BroadcastOverallScoreLevelMapping {
    public static final TypeAdapter ADAPTER;

    @C09CT("low_end_device_max")
    public float low_end_device_max;

    @C09CT("medium_end_device_max")
    public float medium_end_device_max;

    static {
        NormalGson.singleton();
        ADAPTER = new BroadcastOverallScoreLevelMapping_OptTypeAdapter();
    }

    public BroadcastOverallScoreLevelMapping() {
        this(6.5f, 8.0f);
    }

    public final float getLow_end_device_max() {
        return this.low_end_device_max;
    }

    public final float getMedium_end_device_max() {
        return this.medium_end_device_max;
    }

    public final void setLow_end_device_max(float f) {
        this.low_end_device_max = f;
    }

    public final void setMedium_end_device_max(float f) {
        this.medium_end_device_max = f;
    }

    public BroadcastOverallScoreLevelMapping(float f, float f2) {
        this.low_end_device_max = f;
        this.medium_end_device_max = f2;
    }
}
