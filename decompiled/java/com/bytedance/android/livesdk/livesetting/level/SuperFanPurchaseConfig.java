package com.bytedance.android.livesdk.livesetting.level;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_super_fan_purchase_config")
public final class SuperFanPurchaseConfig {
    public static final SuperFanPurchaseConfig INSTANCE = new SuperFanPurchaseConfig();
    public static final SuperFanConfig DEFAULT = new SuperFanConfig(10, 1350, "aweme://roma_redirect/?spark_page=TT_CSP_Live_sf_payfail_bot");

    public static final class SuperFanConfig {
        public static final TypeAdapter ADAPTER;

        @C09CT("feedback_url")
        public String feedbackUrl;

        @C09CT("get_points")
        public int getPoints;

        @C09CT("reach_level")
        public int reachLevel;

        static {
            NormalGson.singleton();
            ADAPTER = new SuperFanPurchaseConfig_SuperFanConfig_OptTypeAdapter();
        }

        public SuperFanConfig() {
            this(10, 1350, "aweme://roma_redirect/?spark_page=TT_CSP_Live_sf_payfail_bot");
        }

        public SuperFanConfig(int i, int i2, String str) {
            this.reachLevel = i;
            this.getPoints = i2;
            this.feedbackUrl = str;
        }
    }

    public final SuperFanConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SuperFanConfig superFanConfig = DEFAULT;
        SuperFanConfig superFanConfig2 = (SuperFanConfig) settingsManager.getValueSafely("live_super_fan_purchase_config", superFanConfig);
        return superFanConfig2 != null ? superFanConfig2 : superFanConfig;
    }

    public final SuperFanConfig getDEFAULT() {
        return DEFAULT;
    }
}
