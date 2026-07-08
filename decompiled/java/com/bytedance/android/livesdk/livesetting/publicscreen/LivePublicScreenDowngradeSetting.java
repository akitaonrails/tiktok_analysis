package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_downgrade_config")
public final class LivePublicScreenDowngradeSetting {
    public static final DowngradeConfig DEFAULT;
    public static final LivePublicScreenDowngradeSetting INSTANCE = new LivePublicScreenDowngradeSetting();
    public static final DowngradeConfig value;

    public static final class DowngradeConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("downgrade_first_interval_factor")
        public float downgradeFirstIntervalFactor;

        @C09CT("downgrade_qps_factor")
        public float downgradeQpsFactor;

        static {
            NormalGson.singleton();
            ADAPTER = new LivePublicScreenDowngradeSetting_DowngradeConfig_OptTypeAdapter();
        }

        public DowngradeConfig() {
            this(1.0f, 1.0f);
        }

        public final float getDowngradeFirstIntervalFactor() {
            return this.downgradeFirstIntervalFactor;
        }

        public final float getDowngradeQpsFactor() {
            return this.downgradeQpsFactor;
        }

        public final void setDowngradeFirstIntervalFactor(float f) {
            this.downgradeFirstIntervalFactor = f;
        }

        public final void setDowngradeQpsFactor(float f) {
            this.downgradeQpsFactor = f;
        }

        public DowngradeConfig(float f, float f2) {
            this.downgradeQpsFactor = f;
            this.downgradeFirstIntervalFactor = f2;
        }
    }

    static {
        DowngradeConfig downgradeConfig = new DowngradeConfig(1.0f, 1.0f);
        DEFAULT = downgradeConfig;
        DowngradeConfig downgradeConfig2 = (DowngradeConfig) SettingsManager.INSTANCE.getValueSafely("live_public_screen_downgrade_config", downgradeConfig);
        if (downgradeConfig2 != null) {
            downgradeConfig = downgradeConfig2;
        }
        value = downgradeConfig;
    }

    public static final float getDowngradeFirstIntervalRatio() {
        return value.getDowngradeFirstIntervalFactor();
    }

    public static final float getDowngradeQpsRatio() {
        return value.getDowngradeQpsFactor();
    }
}
