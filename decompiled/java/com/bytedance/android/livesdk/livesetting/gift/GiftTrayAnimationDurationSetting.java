package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_tray_animation_duration_opt")
public final class GiftTrayAnimationDurationSetting {
    public static final int DEFAULT = 0;
    public static final GiftTrayAnimationDurationSetting INSTANCE = new GiftTrayAnimationDurationSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("gift_tray_animation_duration_opt", DEFAULT) != 0;
    }

    public static final boolean onlyAudience() {
        return SettingsManager.INSTANCE.getIntValue("gift_tray_animation_duration_opt", DEFAULT) == 2;
    }
}
