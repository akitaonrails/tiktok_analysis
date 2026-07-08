package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_linkmic_multi_guest_update_setting_tech_switch")
public final class LinkMicMultiGuestUpdateSettingTechSwitchSetting {
    public static final int DEFAULT = 1;
    public static final LinkMicMultiGuestUpdateSettingTechSwitchSetting INSTANCE = new LinkMicMultiGuestUpdateSettingTechSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_linkmic_multi_guest_update_setting_tech_switch", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
