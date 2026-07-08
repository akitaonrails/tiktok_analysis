package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_live_fyp_destroy_opt")
public final class MultiLiveFYPDestroyOptSettings {
    public static final boolean DEFAULT = false;
    public static final MultiLiveFYPDestroyOptSettings INSTANCE = new MultiLiveFYPDestroyOptSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_live_fyp_destroy_opt", DEFAULT);
    }
}
