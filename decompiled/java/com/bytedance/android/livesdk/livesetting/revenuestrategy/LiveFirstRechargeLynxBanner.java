package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_panel_first_recharge_banner_use_lynx")
public final class LiveFirstRechargeLynxBanner {
    public static final boolean DEFAULT = false;
    public static final LiveFirstRechargeLynxBanner INSTANCE = new LiveFirstRechargeLynxBanner();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_panel_first_recharge_banner_use_lynx", DEFAULT);
    }
}
