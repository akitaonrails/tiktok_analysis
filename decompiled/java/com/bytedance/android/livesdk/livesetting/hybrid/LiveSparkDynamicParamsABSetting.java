package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("mt_live_spark_dynamic_params_ab")
public final class LiveSparkDynamicParamsABSetting {
    public static final LiveSparkDynamicParamsABSetting INSTANCE = new LiveSparkDynamicParamsABSetting();
    public static final SparkDynamicParam[] DEFAULT = new SparkDynamicParam[0];

    public final SparkDynamicParam[] getValue() {
        return (SparkDynamicParam[]) SettingsManager.INSTANCE.getValueSafely("mt_live_spark_dynamic_params_ab", DEFAULT);
    }
}
