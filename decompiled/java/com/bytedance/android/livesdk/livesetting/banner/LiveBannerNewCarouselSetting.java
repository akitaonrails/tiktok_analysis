package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("tt_live_banner_new_carousel_enable")
public final class LiveBannerNewCarouselSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBannerNewCarouselSetting INSTANCE = new LiveBannerNewCarouselSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("tt_live_banner_new_carousel_enable", DEFAULT);
    }
}
