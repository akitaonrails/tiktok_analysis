package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenConfig;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_public_screen_config")
public final class LivePublicScreenConfigSetting {
    public static final LivePublicScreenConfigSetting INSTANCE = new LivePublicScreenConfigSetting();
    public static final LivePublicScreenConfig DEFAULT = new LivePublicScreenConfig();

    public static final LivePublicScreenConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LivePublicScreenConfig livePublicScreenConfig = DEFAULT;
        LivePublicScreenConfig livePublicScreenConfig2 = (LivePublicScreenConfig) settingsManager.getValueSafely("live_public_screen_config", livePublicScreenConfig);
        return livePublicScreenConfig2 != null ? livePublicScreenConfig2 : livePublicScreenConfig;
    }
}
