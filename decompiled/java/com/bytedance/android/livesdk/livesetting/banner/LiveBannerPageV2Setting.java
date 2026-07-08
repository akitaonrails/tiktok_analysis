package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_banner_page_v2")
public final class LiveBannerPageV2Setting {
    public static final boolean DEFAULT = true;
    public static final LiveBannerPageV2Setting INSTANCE = new LiveBannerPageV2Setting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_banner_page_v2", DEFAULT);
    }
}
