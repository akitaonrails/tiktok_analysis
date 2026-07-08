package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_phase1_switcher")
public final class MultiTopLivePhase1SwitcherSetting {
    public static final boolean DEFAULT = true;
    public static final MultiTopLivePhase1SwitcherSetting INSTANCE = new MultiTopLivePhase1SwitcherSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_top_live_phase1_switcher", DEFAULT);
    }
}
