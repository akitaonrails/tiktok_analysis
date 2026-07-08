package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_comment_public_screen_bg_opt")
public final class LiveCommentPublicScreenBgOptSetting {
    public static final LiveCommentPublicScreenBgOptSetting INSTANCE = new LiveCommentPublicScreenBgOptSetting();
    public static final BgSettingConfig DEFAULT = new BgSettingConfig();

    public final boolean getValue(boolean z) {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BgSettingConfig bgSettingConfig = DEFAULT;
        BgSettingConfig bgSettingConfig2 = (BgSettingConfig) settingsManager.getValueSafely("live_comment_public_screen_bg_opt", bgSettingConfig);
        if (bgSettingConfig2 != null) {
            bgSettingConfig = bgSettingConfig2;
        }
        if (z) {
            return bgSettingConfig.anchor;
        }
        return bgSettingConfig.audience;
    }
}
