package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_random_linkmic")
public final class LiveRandomLinkmicSetting {
    public static final LiveRandomLinkmicSetting INSTANCE = new LiveRandomLinkmicSetting();
    public static final RandomLinkMicSetting DEFAULT = new RandomLinkMicSetting();

    public final RandomLinkMicSetting getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RandomLinkMicSetting randomLinkMicSetting = DEFAULT;
        RandomLinkMicSetting randomLinkMicSetting2 = (RandomLinkMicSetting) settingsManager.getValueSafely("live_random_linkmic", randomLinkMicSetting);
        return randomLinkMicSetting2 != null ? randomLinkMicSetting2 : randomLinkMicSetting;
    }

    public final RandomLinkMicSetting getDEFAULT() {
        return DEFAULT;
    }
}
