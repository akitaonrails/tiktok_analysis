package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_update_setting_from_im")
public final class MultiGuestUpdateSettingFromImSetting {
    public static final int DEFAULT = 3;
    public static final MultiGuestUpdateSettingFromImSetting INSTANCE = new MultiGuestUpdateSettingFromImSetting();

    public final boolean enable(boolean z) {
        int intValue = SettingsManager.INSTANCE.getIntValue("multi_guest_update_setting_from_im", DEFAULT);
        if (intValue == 3) {
            return true;
        }
        if (z) {
            if (intValue == 1) {
                return true;
            }
            return false;
        }
        if (intValue == 2) {
            return true;
        }
        return false;
    }
}
