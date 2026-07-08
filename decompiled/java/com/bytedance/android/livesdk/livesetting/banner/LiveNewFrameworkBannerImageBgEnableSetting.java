package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("tiktok_live_banner_image_bg_enable")
public final class LiveNewFrameworkBannerImageBgEnableSetting {
    public static final boolean DEFAULT = false;
    public static final LiveNewFrameworkBannerImageBgEnableSetting INSTANCE = new LiveNewFrameworkBannerImageBgEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("tiktok_live_banner_image_bg_enable", DEFAULT);
    }
}
