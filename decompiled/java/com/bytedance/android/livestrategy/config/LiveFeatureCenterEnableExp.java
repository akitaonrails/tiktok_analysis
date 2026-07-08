package com.bytedance.android.livestrategy.config;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_feature_center_enable")
public final class LiveFeatureCenterEnableExp {
    public static final int DEFAULT = 0;
    public static final LiveFeatureCenterEnableExp INSTANCE = new LiveFeatureCenterEnableExp();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_feature_center_enable", DEFAULT);
    }

    public final boolean isDisable() {
        return getValue() == 0;
    }
}
