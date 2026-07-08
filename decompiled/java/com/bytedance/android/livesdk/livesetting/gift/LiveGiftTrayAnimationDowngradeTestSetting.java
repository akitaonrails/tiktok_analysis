package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_tray_animation_downgrade_test")
public final class LiveGiftTrayAnimationDowngradeTestSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGiftTrayAnimationDowngradeTestSetting INSTANCE = new LiveGiftTrayAnimationDowngradeTestSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_tray_animation_downgrade_test", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
