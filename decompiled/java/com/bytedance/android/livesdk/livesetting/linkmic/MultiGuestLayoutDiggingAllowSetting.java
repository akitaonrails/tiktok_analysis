package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_layout_digging_allow_list")
public final class MultiGuestLayoutDiggingAllowSetting {
    public static final MultiGuestLayoutDiggingAllowSetting INSTANCE = new MultiGuestLayoutDiggingAllowSetting();
    public static final String[] DEFAULT = {"1", "2", "3", "7", "9", "10"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("multi_guest_layout_digging_allow_list", DEFAULT);
    }
}
