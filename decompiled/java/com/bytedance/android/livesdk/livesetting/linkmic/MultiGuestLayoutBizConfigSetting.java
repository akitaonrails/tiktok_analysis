package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("multi_guest_layout_biz_config")
public final class MultiGuestLayoutBizConfigSetting {
    public static final MultiGuestLayoutBizConfigSetting INSTANCE = new MultiGuestLayoutBizConfigSetting();
    public static final String DEFAULT = "";
    public static final String settingValue = SettingsManager.INSTANCE.getStringValue("multi_guest_layout_biz_config", "");

    public final String getSettingValue() {
        return settingValue;
    }
}
