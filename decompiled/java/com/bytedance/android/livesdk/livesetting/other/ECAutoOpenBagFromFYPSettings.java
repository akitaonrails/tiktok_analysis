package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = true, value = "ttec_enter_bag_list_from_fyp_live_preview")
public final class ECAutoOpenBagFromFYPSettings {
    public static final int DEFAULT = 0;
    public static final ECAutoOpenBagFromFYPSettings INSTANCE = new ECAutoOpenBagFromFYPSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("ttec_enter_bag_list_from_fyp_live_preview", DEFAULT) == 1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
