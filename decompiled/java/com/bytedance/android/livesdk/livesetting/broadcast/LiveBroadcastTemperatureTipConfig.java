package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveBroadcastTemperatureTipConfig {
    public static final TypeAdapter ADAPTER = new LiveBroadcastTemperatureTipConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("battery_threshold")
    public float batteryThreshold;

    @C09CT("enable")
    public boolean enable;

    @C09CT("frequency_interval")
    public int frequencyInterval;

    @C09CT("local_test_quick_show")
    public boolean localTestQuickShow;

    @C09CT("monitor_delay")
    public int monitorDelay;

    @C09CT("prefix_emoji")
    public String prefixEmoji;

    @C09CT("thermal_threshold")
    public float thermalThreshold;

    public LiveBroadcastTemperatureTipConfig() {
        this(false, 0.5f, 42.0f, 1440, 60, "", false);
    }

    public final float getBatteryThreshold() {
        return this.batteryThreshold;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getFrequencyInterval() {
        return this.frequencyInterval;
    }

    public final boolean getLocalTestQuickShow() {
        return this.localTestQuickShow;
    }

    public final int getMonitorDelay() {
        return this.monitorDelay;
    }

    public final String getPrefixEmoji() {
        return this.prefixEmoji;
    }

    public final float getThermalThreshold() {
        return this.thermalThreshold;
    }

    public final void setBatteryThreshold(float f) {
        this.batteryThreshold = f;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setFrequencyInterval(int i) {
        this.frequencyInterval = i;
    }

    public final void setLocalTestQuickShow(boolean z) {
        this.localTestQuickShow = z;
    }

    public final void setMonitorDelay(int i) {
        this.monitorDelay = i;
    }

    public final void setPrefixEmoji(String str) {
        this.prefixEmoji = str;
    }

    public final void setThermalThreshold(float f) {
        this.thermalThreshold = f;
    }

    public LiveBroadcastTemperatureTipConfig(boolean z, float f, float f2, int i, int i2, String str, boolean z2) {
        this.enable = z;
        this.batteryThreshold = f;
        this.thermalThreshold = f2;
        this.frequencyInterval = i;
        this.monitorDelay = i2;
        this.prefixEmoji = str;
        this.localTestQuickShow = z2;
    }
}
