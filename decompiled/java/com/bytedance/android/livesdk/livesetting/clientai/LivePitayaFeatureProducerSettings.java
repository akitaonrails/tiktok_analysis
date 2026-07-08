package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_revenue_feature_produce_enable")
public final class LivePitayaFeatureProducerSettings {
    public static final boolean DEFAULT = false;
    public static final LivePitayaFeatureProducerSettings INSTANCE = new LivePitayaFeatureProducerSettings();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_revenue_feature_produce_enable", DEFAULT);
    }
}
