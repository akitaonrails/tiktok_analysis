package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_layout_biz_view_style")
public final class MultiGuestLayoutBizViewStyleSetting {
    public static final MultiGuestLayoutBizViewStyleSetting INSTANCE = new MultiGuestLayoutBizViewStyleSetting();
    public static final String DEFAULT = "";
    public static final String settingValue = SettingsManager.INSTANCE.getStringValue("multi_guest_layout_biz_view_style", "");

    public final String getSettingValue() {
        return settingValue;
    }
}
