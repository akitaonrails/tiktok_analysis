package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_tray_performance_optimisation")
public final class LiveGiftTrayPerformanceOptimisationSetting {
    public static final LiveGiftTrayPerformanceOptimisationSetting INSTANCE = new LiveGiftTrayPerformanceOptimisationSetting();
    public static final GiftTrayPerformanceOptimisationConfig DEFAULT = new GiftTrayPerformanceOptimisationConfig();

    public static final class GiftTrayPerformanceOptimisationConfig {
        public static final TypeAdapter ADAPTER = new LiveGiftTrayPerformanceOptimisationSetting_GiftTrayPerformanceOptimisationConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("downgrade_right_tag_enabled")
        public boolean downgradeRightTagEnabled;

        @C09CT("right_tag_transition_opt_enabled")
        public boolean rightTagTransitionOptEnabled;
    }

    public final GiftTrayPerformanceOptimisationConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GiftTrayPerformanceOptimisationConfig giftTrayPerformanceOptimisationConfig = DEFAULT;
        GiftTrayPerformanceOptimisationConfig giftTrayPerformanceOptimisationConfig2 = (GiftTrayPerformanceOptimisationConfig) settingsManager.getValueSafely("live_gift_tray_performance_optimisation", giftTrayPerformanceOptimisationConfig);
        return giftTrayPerformanceOptimisationConfig2 != null ? giftTrayPerformanceOptimisationConfig2 : giftTrayPerformanceOptimisationConfig;
    }
}
