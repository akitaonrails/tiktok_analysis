package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_banner_mid_big_word_mode_opt")
public final class LiveBannerAndMidBigWordModeOptEnableSetting {
    public static final LiveBannerAndMidBigWordModeOptEnableSetting INSTANCE = new LiveBannerAndMidBigWordModeOptEnableSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_banner_mid_big_word_mode_opt", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
