package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "aigc_wallpaper_invite_countdown_time")
public final class AigcWallpaperInvitedCountDownTimeSetting {
    public static final int DEFAULT = 5;
    public static final AigcWallpaperInvitedCountDownTimeSetting INSTANCE = new AigcWallpaperInvitedCountDownTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("aigc_wallpaper_invite_countdown_time", DEFAULT);
    }
}
