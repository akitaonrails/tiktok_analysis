package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multi_wallpaper_ab_group")
public final class LinkMicWallpaperAbGroupSetting {
    public static final String DEFAULT = "";
    public static final LinkMicWallpaperAbGroupSetting INSTANCE = new LinkMicWallpaperAbGroupSetting();

    public static final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("multi_wallpaper_ab_group", DEFAULT);
    }
}
