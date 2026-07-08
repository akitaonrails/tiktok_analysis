package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subathon")
public final class LiveSubathonSetting {
    public static final LiveSubathonSetting INSTANCE = new LiveSubathonSetting();
    public static final LiveSubathonConfig DEFAULT = new LiveSubathonConfig(false, false, 10, 120, 300, true);

    public final LiveSubathonConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveSubathonConfig liveSubathonConfig = DEFAULT;
        LiveSubathonConfig liveSubathonConfig2 = (LiveSubathonConfig) settingsManager.getValueSafely("live_subathon", liveSubathonConfig);
        return liveSubathonConfig2 != null ? liveSubathonConfig2 : liveSubathonConfig;
    }

    public final LiveSubathonConfig getDEFAULT() {
        return DEFAULT;
    }
}
