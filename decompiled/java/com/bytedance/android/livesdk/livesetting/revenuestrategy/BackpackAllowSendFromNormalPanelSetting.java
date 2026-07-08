package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("allow_send_backpack_gift_from_normal_panel")
public final class BackpackAllowSendFromNormalPanelSetting {
    public static final boolean DEFAULT = false;
    public static final BackpackAllowSendFromNormalPanelSetting INSTANCE = new BackpackAllowSendFromNormalPanelSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("allow_send_backpack_gift_from_normal_panel", DEFAULT);
    }
}
