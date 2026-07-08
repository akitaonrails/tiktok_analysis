package com.bytedance.android.livesdk.livesetting.banner;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_banner_strategy_config")
public final class LiveBannerStrategyConfigSetting {
    public static final LiveBannerStrategyConfigSetting INSTANCE = new LiveBannerStrategyConfigSetting();
    public static final BannerStrategyConfig DEFAULT = new BannerStrategyConfig(0, C2097608Jq.LJ(), C2097608Jq.LJ());

    private final BannerStrategyConfig getConfig() {
        return (BannerStrategyConfig) SettingsManager.INSTANCE.getValueSafely("live_banner_strategy_config", DEFAULT);
    }

    public final boolean enable() {
        BannerStrategyConfig config = getConfig();
        return config != null && config.enable == 1;
    }

    public final Map<String, Integer> getBusinessClassification() {
        Map<String, Integer> map;
        BannerStrategyConfig config = getConfig();
        return (config == null || (map = config.businessClassification) == null) ? C2097608Jq.LJ() : map;
    }

    public final Map<String, Object> getDelayClassification() {
        Map<String, ? extends Object> map;
        BannerStrategyConfig config = getConfig();
        return (config == null || (map = config.delayClassification) == null) ? C2097608Jq.LJ() : map;
    }

    public static final class BannerStrategyConfig {
        public static final TypeAdapter ADAPTER = new LiveBannerStrategyConfigSetting_BannerStrategyConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("business_classification")
        public Map<String, Integer> businessClassification;

        @C09CT("delay_classification")
        public Map<String, ? extends Object> delayClassification;

        @C09CT("enable")
        public int enable;

        public BannerStrategyConfig() {
            this(0, C2097608Jq.LJ(), C2097608Jq.LJ());
        }

        public BannerStrategyConfig(int i, Map<String, ? extends Object> map, Map<String, Integer> map2) {
            this.enable = i;
            this.delayClassification = map;
            this.businessClassification = map2;
        }
    }
}
