package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_sdk_update_layout_switch_layout_success")
public final class LiveSdkUpdateLayoutSwitchLayoutSuccessSetting {
    public static final boolean DEFAULT = false;
    public static final LiveSdkUpdateLayoutSwitchLayoutSuccessSetting INSTANCE = new LiveSdkUpdateLayoutSwitchLayoutSuccessSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_sdk_update_layout_switch_layout_success", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
