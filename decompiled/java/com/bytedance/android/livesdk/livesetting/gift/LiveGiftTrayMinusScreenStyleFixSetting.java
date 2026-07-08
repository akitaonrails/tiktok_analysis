package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_gift_tray_minus_screen_style_fix")
public final class LiveGiftTrayMinusScreenStyleFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveGiftTrayMinusScreenStyleFixSetting INSTANCE = new LiveGiftTrayMinusScreenStyleFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_tray_minus_screen_style_fix", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
