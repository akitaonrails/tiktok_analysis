package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("retention_consumption_task_settings")
public final class RetentionConsumptionTaskSettings {
    public static final boolean DEFAULT = false;
    public static final RetentionConsumptionTaskSettings INSTANCE = new RetentionConsumptionTaskSettings();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("retention_consumption_task_settings", DEFAULT);
    }
}
