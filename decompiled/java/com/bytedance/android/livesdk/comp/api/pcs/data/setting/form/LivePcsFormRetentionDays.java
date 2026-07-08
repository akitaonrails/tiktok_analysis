package com.bytedance.android.livesdk.comp.api.pcs.data.setting.form;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_form_retention_days")
public final class LivePcsFormRetentionDays {
    public static final int DEFAULT = 365;
    public static final LivePcsFormRetentionDays INSTANCE = new LivePcsFormRetentionDays();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_form_retention_days", DEFAULT);
    }
}
