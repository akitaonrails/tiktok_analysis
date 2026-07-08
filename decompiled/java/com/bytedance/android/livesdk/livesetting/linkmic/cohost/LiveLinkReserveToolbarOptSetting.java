package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_linkmic_reserve_toolbar_opt_setting")
public final class LiveLinkReserveToolbarOptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveLinkReserveToolbarOptSetting INSTANCE = new LiveLinkReserveToolbarOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_linkmic_reserve_toolbar_opt_setting", DEFAULT);
    }
}
