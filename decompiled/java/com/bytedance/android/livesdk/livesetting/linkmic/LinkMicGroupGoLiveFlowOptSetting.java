package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_group_go_live_flow_opt")
public final class LinkMicGroupGoLiveFlowOptSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicGroupGoLiveFlowOptSetting INSTANCE = new LinkMicGroupGoLiveFlowOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("link_mic_group_go_live_flow_opt", DEFAULT);
    }

    public final boolean showSheetAfterGuide() {
        return getValue() == 2;
    }

    public final boolean showSheetPastGuide() {
        return getValue() > 0;
    }
}
