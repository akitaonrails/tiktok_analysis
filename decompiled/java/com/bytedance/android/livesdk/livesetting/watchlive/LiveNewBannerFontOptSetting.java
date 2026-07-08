package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_banner_font_opt")
public final class LiveNewBannerFontOptSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE = 1;
    public static final LiveNewBannerFontOptSetting INSTANCE = new LiveNewBannerFontOptSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_banner_font_opt", DEFAULT) == 1;
    }
}
