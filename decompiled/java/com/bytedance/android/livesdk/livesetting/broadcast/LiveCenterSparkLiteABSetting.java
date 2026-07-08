package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes34.dex */
@SettingsKey(preciseExperiment = true, value = "anchor_live_center_spark_lite")
public final class LiveCenterSparkLiteABSetting {
    public static final int DEFAULT = 0;
    public static final LiveCenterSparkLiteABSetting INSTANCE = new LiveCenterSparkLiteABSetting();

    public final boolean isLibOne() {
        return SettingsManager.INSTANCE.getIntValue("anchor_live_center_spark_lite", DEFAULT) == 1;
    }

    public final boolean isLibTwo() {
        return SettingsManager.INSTANCE.getIntValue("anchor_live_center_spark_lite", DEFAULT) == 2;
    }

    public final boolean isMatch() {
        return isLibOne() || isLibTwo();
    }
}
