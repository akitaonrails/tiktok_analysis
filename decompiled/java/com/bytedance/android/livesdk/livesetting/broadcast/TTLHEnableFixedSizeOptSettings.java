package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_fixed_size_settings")
public final class TTLHEnableFixedSizeOptSettings {
    public static final TTLHEnableFixedSizeOptSettings INSTANCE = new TTLHEnableFixedSizeOptSettings();
    public static final TTLHSetFixedSizeOptConfig DEFAULT = new TTLHSetFixedSizeOptConfig();

    public static final class TTLHSetFixedSizeOptConfig implements Serializable {
        public static final TypeAdapter ADAPTER;

        @C09CT("rectify_draw_delay_time")
        public long delayTime = 600;

        @C09CT("enable_set_fixed_size_opt")
        public int enable;

        @C09CT("ignore_similar_wh_rate")
        public int ignoreSimilarWHRate;

        static {
            NormalGson.singleton();
            ADAPTER = new TTLHEnableFixedSizeOptSettings_TTLHSetFixedSizeOptConfig_OptTypeAdapter();
        }

        public final boolean enabled() {
            return this.enable == 1;
        }

        public final boolean ignoreWHRate() {
            return this.ignoreSimilarWHRate == 1;
        }

        public final long getDelayTime() {
            return this.delayTime;
        }

        public final int getEnable() {
            return this.enable;
        }

        public final int getIgnoreSimilarWHRate() {
            return this.ignoreSimilarWHRate;
        }

        public final void setDelayTime(long j) {
            this.delayTime = j;
        }

        public final void setEnable(int i) {
            this.enable = i;
        }

        public final void setIgnoreSimilarWHRate(int i) {
            this.ignoreSimilarWHRate = i;
        }
    }

    public final TTLHSetFixedSizeOptConfig getConfigs() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TTLHSetFixedSizeOptConfig tTLHSetFixedSizeOptConfig = DEFAULT;
        TTLHSetFixedSizeOptConfig tTLHSetFixedSizeOptConfig2 = (TTLHSetFixedSizeOptConfig) settingsManager.getValueSafely("ttlh_enable_fixed_size_settings", tTLHSetFixedSizeOptConfig);
        return tTLHSetFixedSizeOptConfig2 != null ? tTLHSetFixedSizeOptConfig2 : tTLHSetFixedSizeOptConfig;
    }
}
