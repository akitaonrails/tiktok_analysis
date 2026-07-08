package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_hangout_live_card_optimize")
public final class MultiHangoutLiveCardOptimizeSetting {
    public static final boolean DEFAULT = false;
    public static final MultiHangoutLiveCardOptimizeSetting INSTANCE = new MultiHangoutLiveCardOptimizeSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_hangout_live_card_optimize", DEFAULT) && LiveSdkMultiTopLivePhase3Setting.INSTANCE.isEnable();
    }
}
