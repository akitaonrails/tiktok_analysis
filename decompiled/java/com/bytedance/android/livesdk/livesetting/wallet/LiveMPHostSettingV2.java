package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("gbl_mp_order_host")
public final class LiveMPHostSettingV2 {
    public static final String DEFAULT = "https://webcast.tiktokv.com";
    public static final LiveMPHostSettingV2 INSTANCE = new LiveMPHostSettingV2();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("gbl_mp_order_host", DEFAULT);
    }
}
