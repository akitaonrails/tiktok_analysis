package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "gbl_server_features_list")
public final class GblServerFeaturesListSetting {
    public static final GblServerFeaturesListSetting INSTANCE = new GblServerFeaturesListSetting();
    public static final int[] DEFAULT = new int[0];

    public final int[] getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int[] iArr = DEFAULT;
        int[] iArr2 = (int[]) settingsManager.getValueSafely("gbl_server_features_list", iArr);
        return iArr2 != null ? iArr2 : iArr;
    }

    public final boolean isEnableServerFeature() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        int[] iArr = DEFAULT;
        int[] iArr2 = (int[]) settingsManager.getValueSafely("gbl_server_features_list", iArr);
        if (iArr2 != null) {
            iArr = iArr2;
        }
        return iArr.length != 0 && LiveGameAiFeatureCenterSwitchSetting.INSTANCE.getValue();
    }
}
