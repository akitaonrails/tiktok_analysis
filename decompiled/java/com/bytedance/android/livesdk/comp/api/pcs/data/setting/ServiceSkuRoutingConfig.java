package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class ServiceSkuRoutingConfig {
    public static final TypeAdapter ADAPTER = new ServiceSkuRoutingConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("global_threshold")
    public float globalThreshold;

    @C09CT("ignore_frequency_for_test")
    public boolean ignoreFrequencyForTest;

    @C09CT("max_show_per_day")
    public int maxShowPerDay;

    @C09CT("max_show_per_session")
    public int maxShowPerSession;

    public ServiceSkuRoutingConfig() {
        this(false, 0.5f, 2, 3, false);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final float getGlobalThreshold() {
        return this.globalThreshold;
    }

    public final boolean getIgnoreFrequencyForTest() {
        return this.ignoreFrequencyForTest;
    }

    public final int getMaxShowPerDay() {
        return this.maxShowPerDay;
    }

    public final int getMaxShowPerSession() {
        return this.maxShowPerSession;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setGlobalThreshold(float f) {
        this.globalThreshold = f;
    }

    public final void setIgnoreFrequencyForTest(boolean z) {
        this.ignoreFrequencyForTest = z;
    }

    public final void setMaxShowPerDay(int i) {
        this.maxShowPerDay = i;
    }

    public final void setMaxShowPerSession(int i) {
        this.maxShowPerSession = i;
    }

    public ServiceSkuRoutingConfig(boolean z, float f, int i, int i2, boolean z2) {
        this.enabled = z;
        this.globalThreshold = f;
        this.maxShowPerSession = i;
        this.maxShowPerDay = i2;
        this.ignoreFrequencyForTest = z2;
    }
}
