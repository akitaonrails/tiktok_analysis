package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_gift_tray_request_opt_first_layout")
public final class LiveGiftTrayRequestOptFirstLayoutSetting {
    public static final boolean DEFAULT = false;
    public static final LiveGiftTrayRequestOptFirstLayoutSetting INSTANCE = new LiveGiftTrayRequestOptFirstLayoutSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_tray_request_opt_first_layout", DEFAULT);
    }
}
