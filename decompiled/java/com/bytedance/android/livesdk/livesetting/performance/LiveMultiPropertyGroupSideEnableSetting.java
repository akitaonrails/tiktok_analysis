package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_multi_property_group_side_setting")
public final class LiveMultiPropertyGroupSideEnableSetting {
    public static final LiveMultiPropertyGroupSideEnableSetting INSTANCE = new LiveMultiPropertyGroupSideEnableSetting();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_multi_property_group_side_setting", DEFAULT);

    public final boolean enable(boolean z) {
        if (z) {
            if (LiveMultiPropertyGroupOptSetting.INSTANCE.enable() && value == 1) {
                return true;
            }
            return false;
        }
        return LiveMultiPropertyGroupOptSetting.INSTANCE.enable();
    }
}
