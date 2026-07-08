package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "mt_live_hybrid_reuse_config_android")
public final class LiveHybridReuseConfigAndroidSetting {
    public static final LiveHybridReuseConfigAndroidSetting INSTANCE = new LiveHybridReuseConfigAndroidSetting();
    public static final SparkReuseConfig[] DEFAULT = new SparkReuseConfig[0];

    public final SparkReuseConfig[] getValue() {
        return (SparkReuseConfig[]) SettingsManager.INSTANCE.getValueSafely("mt_live_hybrid_reuse_config_android", DEFAULT);
    }
}
