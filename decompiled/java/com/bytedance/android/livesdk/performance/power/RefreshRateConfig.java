package com.bytedance.android.livesdk.performance.power;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class RefreshRateConfig {
    public static final TypeAdapter ADAPTER = new RefreshRateConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("temp_threshold")
    public float highTempThreshold;

    @C09CT("is_enabled")
    public boolean isEnabled;

    @C09CT("battery_threshold")
    public float lowBatteryThreshold;

    public RefreshRateConfig() {
        this(false, 30.0f, 20.0f);
    }

    public final float getHighTempThreshold() {
        return this.highTempThreshold;
    }

    public final float getLowBatteryThreshold() {
        return this.lowBatteryThreshold;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setHighTempThreshold(float f) {
        this.highTempThreshold = f;
    }

    public final void setLowBatteryThreshold(float f) {
        this.lowBatteryThreshold = f;
    }

    public RefreshRateConfig(boolean z, float f, float f2) {
        this.isEnabled = z;
        this.highTempThreshold = f;
        this.lowBatteryThreshold = f2;
    }
}
