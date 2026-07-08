package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_interactive_gift_config")
public final class LynxDowngradeSettings {
    public static final LynxDowngradeSettings INSTANCE = new LynxDowngradeSettings();
    public static final DowngradeSettings DEFAULT = new DowngradeSettings();

    public final DowngradeSettings getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        DowngradeSettings downgradeSettings = DEFAULT;
        DowngradeSettings downgradeSettings2 = (DowngradeSettings) settingsManager.getValueSafely("live_interactive_gift_config", downgradeSettings);
        return downgradeSettings2 != null ? downgradeSettings2 : downgradeSettings;
    }

    public final DowngradeSettings getDEFAULT() {
        return DEFAULT;
    }
}
