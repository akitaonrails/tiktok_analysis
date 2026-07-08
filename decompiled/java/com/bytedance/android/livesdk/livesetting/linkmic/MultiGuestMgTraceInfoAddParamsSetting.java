package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_multiguest_mg_trace_info_add_paramm")
public final class MultiGuestMgTraceInfoAddParamsSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestMgTraceInfoAddParamsSetting INSTANCE = new MultiGuestMgTraceInfoAddParamsSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_multiguest_mg_trace_info_add_paramm", DEFAULT);
    }
}
