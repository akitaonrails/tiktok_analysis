package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.LiveScrollConfig;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_scroll_config")
public final class LiveAdjustScrollConfigSetting {
    public static final LiveAdjustScrollConfigSetting INSTANCE = new LiveAdjustScrollConfigSetting();
    public static final LiveScrollConfig DEFAULT = new LiveScrollConfig(25.0f, 400, 0.4f);

    public final LiveScrollConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveScrollConfig liveScrollConfig = DEFAULT;
        LiveScrollConfig liveScrollConfig2 = (LiveScrollConfig) settingsManager.getValueSafely("live_scroll_config", liveScrollConfig);
        return liveScrollConfig2 != null ? liveScrollConfig2 : liveScrollConfig;
    }

    public final LiveScrollConfig getDEFAULT() {
        return DEFAULT;
    }
}
