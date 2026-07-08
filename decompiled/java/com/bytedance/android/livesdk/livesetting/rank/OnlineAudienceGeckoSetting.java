package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_audience_ranking_gecko")
public final class OnlineAudienceGeckoSetting {
    public static final OnlineAudienceGeckoSetting INSTANCE = new OnlineAudienceGeckoSetting();
    public static final Config DEFAULT = new Config(false, "revenue_client_audience_ranking_lynx");

    public final Config getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Config config = DEFAULT;
        Config config2 = (Config) settingsManager.getValueSafely("live_audience_ranking_gecko", config);
        return config2 != null ? config2 : config;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new OnlineAudienceGeckoSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("audience_list_gecko_channel")
        public String audienceListGeckoChannel;

        @C09CT("is_audience_list_gecko_setting_on")
        public boolean isAudienceListGeckoSettingOn;

        public Config() {
            this(false, "revenue_client_audience_ranking_lynx");
        }

        public Config(boolean z, String str) {
            this.isAudienceListGeckoSettingOn = z;
            this.audienceListGeckoChannel = str;
        }
    }
}
