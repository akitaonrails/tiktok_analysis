package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_mg_social_game_lets_dance_setting")
public final class MultiGuestLetsDanceSetting {
    public static final MultiGuestLetsDanceSetting INSTANCE = new MultiGuestLetsDanceSetting();
    public static final boolean DEFAULT = true;
    public static final boolean isEnable = SettingsManager.INSTANCE.getBooleanValue("live_mg_social_game_lets_dance_setting", true);

    public final boolean isEnable() {
        return isEnable;
    }
}
