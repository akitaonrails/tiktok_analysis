package com.bytedance.android.livesdk.setting;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_drawer_tab_landing_support_type")
public final class LiveDrawerTabLandingSupportTypeSetting {
    public static final String[] DEFAULT;
    public static final LiveDrawerTabLandingSupportTypeSetting INSTANCE = new LiveDrawerTabLandingSupportTypeSetting();
    public static final String[] value;

    static {
        String[] strArr = new String[0];
        DEFAULT = strArr;
        String[] stringArrayValue = SettingsManager.INSTANCE.getStringArrayValue("live_drawer_tab_landing_support_type", strArr);
        if (stringArrayValue != null) {
            strArr = stringArrayValue;
        }
        value = strArr;
    }

    public static final boolean contains(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return C13LQ.LJIILLIIL(str, value);
    }
}
