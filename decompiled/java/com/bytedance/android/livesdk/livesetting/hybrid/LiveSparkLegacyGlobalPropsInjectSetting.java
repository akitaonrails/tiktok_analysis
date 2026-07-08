package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("mt_live_spark_legacy_global_props_inject")
public final class LiveSparkLegacyGlobalPropsInjectSetting {
    public static final LiveSparkLegacyGlobalPropsInjectSetting INSTANCE = new LiveSparkLegacyGlobalPropsInjectSetting();
    public static final String[] DEFAULT = {""};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("mt_live_spark_legacy_global_props_inject", DEFAULT);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
