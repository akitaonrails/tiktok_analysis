package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "first_frame_report_filter_sei_switch")
public final class FirstFrameFilterSeiSwitch {
    public static final boolean DEFAULT = false;
    public static final FirstFrameFilterSeiSwitch INSTANCE = new FirstFrameFilterSeiSwitch();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("first_frame_report_filter_sei_switch", DEFAULT);
    }
}
