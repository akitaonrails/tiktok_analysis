package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("mt_live_spark_dynamic_params")
public final class LiveSparkDynamicParamsSetting {
    public static final LiveSparkDynamicParamsSetting INSTANCE = new LiveSparkDynamicParamsSetting();
    public static final SparkDynamicParam[] DEFAULT = new SparkDynamicParam[0];

    public final SparkDynamicParam[] getValue() {
        return (SparkDynamicParam[]) SettingsManager.INSTANCE.getValueSafely("mt_live_spark_dynamic_params", DEFAULT);
    }
}
