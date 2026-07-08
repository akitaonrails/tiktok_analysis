package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_multiguest_partial_props_max_num")
public final class LiveMultiguestPartialPropsMaxNumSetting {
    public static final int DEFAULT = 10;
    public static final LiveMultiguestPartialPropsMaxNumSetting INSTANCE = new LiveMultiguestPartialPropsMaxNumSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_multiguest_partial_props_max_num", DEFAULT);
    }
}
