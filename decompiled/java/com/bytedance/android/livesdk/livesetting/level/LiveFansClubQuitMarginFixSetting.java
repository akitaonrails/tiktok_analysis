package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_club_quit_margin_fixed_enable")
public final class LiveFansClubQuitMarginFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubQuitMarginFixSetting INSTANCE = new LiveFansClubQuitMarginFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_quit_margin_fixed_enable", DEFAULT);
    }
}
