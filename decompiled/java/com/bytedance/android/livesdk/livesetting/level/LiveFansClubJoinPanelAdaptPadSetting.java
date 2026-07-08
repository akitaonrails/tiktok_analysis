package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_fans_club_join_panel_adapt_pad")
public final class LiveFansClubJoinPanelAdaptPadSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubJoinPanelAdaptPadSetting INSTANCE = new LiveFansClubJoinPanelAdaptPadSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_join_panel_adapt_pad", DEFAULT);
    }
}
