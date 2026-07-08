package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_aigc_wallpaper_reset_stale_session")
public final class MultiGuestAigcWallpaperResetStaleSessionSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestAigcWallpaperResetStaleSessionSetting INSTANCE = new MultiGuestAigcWallpaperResetStaleSessionSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_aigc_wallpaper_reset_stale_session", DEFAULT);
    }
}
