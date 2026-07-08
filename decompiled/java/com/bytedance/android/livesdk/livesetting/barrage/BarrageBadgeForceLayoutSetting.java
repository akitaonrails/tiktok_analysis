package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_barrage_badge_force_layout_setting")
public final class BarrageBadgeForceLayoutSetting {
    public static final BarrageBadgeForceLayoutSetting INSTANCE = new BarrageBadgeForceLayoutSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_barrage_badge_force_layout_setting", DEFAULT);
    }
}
