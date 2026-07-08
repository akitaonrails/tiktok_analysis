package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_layout_qos_result_require_context")
public final class LinkmicFixLayoutQosResultRequireContext {
    public static final boolean DEFAULT = true;
    public static final LinkmicFixLayoutQosResultRequireContext INSTANCE = new LinkmicFixLayoutQosResultRequireContext();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_layout_qos_result_require_context", DEFAULT);
    }
}
