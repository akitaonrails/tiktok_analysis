package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "enable_cohost_suggestions")
public final class CoHostViewerSuggestionsExperimentSetting {
    public static final boolean DEFAULT = false;
    public static final CoHostViewerSuggestionsExperimentSetting INSTANCE = new CoHostViewerSuggestionsExperimentSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_cohost_suggestions", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
