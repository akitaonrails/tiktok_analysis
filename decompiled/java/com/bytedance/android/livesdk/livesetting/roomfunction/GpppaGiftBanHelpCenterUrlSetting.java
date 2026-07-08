package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("gpppa_gift_ban_help_center_url")
public final class GpppaGiftBanHelpCenterUrlSetting {
    public static final String DEFAULT = "";
    public static final GpppaGiftBanHelpCenterUrlSetting INSTANCE = new GpppaGiftBanHelpCenterUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("gpppa_gift_ban_help_center_url", DEFAULT);
    }
}
