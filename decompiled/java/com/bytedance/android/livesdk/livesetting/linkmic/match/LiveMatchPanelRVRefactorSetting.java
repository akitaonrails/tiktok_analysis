package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_panel_rv_refactor")
public final class LiveMatchPanelRVRefactorSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchPanelRVRefactorSetting INSTANCE = new LiveMatchPanelRVRefactorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_panel_rv_refactor", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
