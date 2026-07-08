package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_friends_rank_match_notification_panel_config")
public final class LiveFriendsRankMatchNotificationPanelConfigSetting {
    public static final LiveFriendsRankMatchNotificationPanelConfigSetting INSTANCE = new LiveFriendsRankMatchNotificationPanelConfigSetting();
    public static final Config DEFAULT = new Config(false, "");

    public final Config getValue() {
        Config config = (Config) SettingsManager.INSTANCE.getValueSafely(LiveFriendsRankMatchNotificationPanelConfigSetting.class);
        return config == null ? DEFAULT : config;
    }

    public final String getSettingsLink() {
        String str = getValue().settingsLink;
        return str == null ? "" : str;
    }

    public final boolean isEnable() {
        String str;
        Config value = getValue();
        return (!value.enable || (str = value.settingsLink) == null || a0.LJJJIL(str)) ? false : true;
    }

    public static final class Config {
        public static final TypeAdapter ADAPTER = new LiveFriendsRankMatchNotificationPanelConfigSetting_Config_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("settings_link")
        public String settingsLink;

        public Config() {
            this(false, "");
        }

        public Config(boolean z, String str) {
            this.enable = z;
            this.settingsLink = str;
        }
    }
}
