package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("profile_page_lop_banner")
public final class ProfilePageLopBannerSetting {
    public static final LopBanner DEFAULT;
    public static final ProfilePageLopBannerSetting INSTANCE = new ProfilePageLopBannerSetting();
    public static final LopBanner config;

    static {
        LopBanner lopBanner = new LopBanner("sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params={request_from:profile_lop_banner}");
        DEFAULT = lopBanner;
        config = (LopBanner) SettingsManager.INSTANCE.getValueSafely("profile_page_lop_banner", lopBanner);
    }

    public final String getGoLiveSchema() {
        return config.getGoLiveSchema();
    }
}
