package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("cohost_activity_badge_debug_setting")
public final class CohostActivityBadgeDebugSetting {
    public static final CohostActivityBadgeDebugSetting INSTANCE = new CohostActivityBadgeDebugSetting();
    public static final Configs DEFAULT = new Configs(false, "");

    public final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_activity_badge_debug_setting", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final String getDebugBadgeText() {
        return getValue().badgeText;
    }

    public final boolean isEnabled() {
        return getValue().enabled;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostActivityBadgeDebugSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("badge_text")
        public String badgeText;

        @C09CT("enabled")
        public boolean enabled;

        public Configs() {
            this(false, "");
        }

        public Configs(boolean z, String str) {
            this.enabled = z;
            this.badgeText = str;
        }
    }
}
