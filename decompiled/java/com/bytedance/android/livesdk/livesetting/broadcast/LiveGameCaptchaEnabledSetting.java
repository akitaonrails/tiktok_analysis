package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_game_captcha_enabled")
public final class LiveGameCaptchaEnabledSetting {
    public static final int DEFAULT = 1;
    public static final LiveGameCaptchaEnabledSetting INSTANCE = new LiveGameCaptchaEnabledSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getIntValue("live_game_captcha_enabled", DEFAULT) == 1;
    }
}
