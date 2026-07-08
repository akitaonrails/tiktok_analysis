package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("mt_live_spark_global_props_filter_android")
public final class LiveSparkGlobalPropsFilterSetting {
    public static final LiveSparkGlobalPropsFilterSetting INSTANCE = new LiveSparkGlobalPropsFilterSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("mt_live_spark_global_props_filter_android", DEFAULT);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
