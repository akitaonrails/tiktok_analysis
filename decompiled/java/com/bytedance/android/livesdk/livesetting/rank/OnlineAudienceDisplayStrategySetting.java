package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("online_audience_display_strategy_setting")
public final class OnlineAudienceDisplayStrategySetting {
    public static final OnlineAudienceDisplayStrategySetting INSTANCE = new OnlineAudienceDisplayStrategySetting();
    public static final Config DEFAULT = new Config(true, 4);

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("online_audience_display_strategy_setting", config);
        return config2 != null ? config2 : config;
    }

    public final Config getDefaultValue() {
        return DEFAULT;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new OnlineAudienceDisplayStrategySetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("online_audience_display_number")
        public int displayNumberN;

        @C09CT("online_audience_display_strategy_on")
        public boolean useOnlineDisplayStrategy;

        public Config() {
            this(true, 4);
        }

        public Config(boolean z, int i) {
            this.useOnlineDisplayStrategy = z;
            this.displayNumberN = i;
        }
    }
}
