package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_activity_badge_enable")
public final class CohostActivityBadgeEnableSetting {
    public static final CohostActivityBadgeEnableSetting INSTANCE = new CohostActivityBadgeEnableSetting();
    public static final Configs DEFAULT = new Configs(true, false);

    private final Configs getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        Configs configs = DEFAULT;
        Configs configs2 = (Configs) settingsManager.getValueSafely("cohost_activity_badge_enable", configs);
        return configs2 != null ? configs2 : configs;
    }

    public final boolean isEnabled() {
        return getValue().enabled;
    }

    public final boolean isSupportDarkMode() {
        return getValue().supportDarkMode;
    }

    public static final class Configs {
        public static final TypeAdapter ADAPTER = new CohostActivityBadgeEnableSetting_Configs_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enabled")
        public boolean enabled;

        @C09CT("support_dark_mode")
        public boolean supportDarkMode;

        public Configs() {
            this(true, false);
        }

        public Configs(boolean z, boolean z2) {
            this.enabled = z;
            this.supportDarkMode = z2;
        }
    }
}
