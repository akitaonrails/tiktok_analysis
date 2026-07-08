package com.bytedance.android.livesdk.livesetting.performance.degrade;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("bad_phones_watch_live_common_ui_opt")
public final class BadPhonesWatchLiveCommonUIOptSetting {
    public static final BadPhonesWatchLiveCommonUIConfig DEFAULT;
    public static final BadPhonesWatchLiveCommonUIOptSetting INSTANCE = new BadPhonesWatchLiveCommonUIOptSetting();

    static {
        TypeAdapter typeAdapter = BadPhonesWatchLiveCommonUIConfig.ADAPTER;
        DEFAULT = new BadPhonesWatchLiveCommonUIConfig();
    }

    private final BadPhonesWatchLiveCommonUIConfig getDelayWidgetLoadConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BadPhonesWatchLiveCommonUIConfig badPhonesWatchLiveCommonUIConfig = DEFAULT;
        BadPhonesWatchLiveCommonUIConfig badPhonesWatchLiveCommonUIConfig2 = (BadPhonesWatchLiveCommonUIConfig) settingsManager.getValueSafely("bad_phones_watch_live_common_ui_opt", badPhonesWatchLiveCommonUIConfig);
        return badPhonesWatchLiveCommonUIConfig2 != null ? badPhonesWatchLiveCommonUIConfig2 : badPhonesWatchLiveCommonUIConfig;
    }

    public final boolean getDisableGaussBlurred() {
        return getDelayWidgetLoadConfig().disableGaussBlurred;
    }

    public final boolean getRemoveBottomShadow() {
        return getDelayWidgetLoadConfig().removeBottomShadow;
    }

    public final boolean getRemoveInsertMessageAnimation() {
        return getDelayWidgetLoadConfig().removeInsertMessageAnimation;
    }

    public final boolean getRemoveTopShadow() {
        return getDelayWidgetLoadConfig().removeTopShadow;
    }
}
