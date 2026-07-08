package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_aigc_wallpaper_audience_side")
public final class MultiGuestAigcWallpaperAudienceSideSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestAigcWallpaperAudienceSideSetting INSTANCE = new MultiGuestAigcWallpaperAudienceSideSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_aigc_wallpaper_audience_side", DEFAULT);
    }
}
