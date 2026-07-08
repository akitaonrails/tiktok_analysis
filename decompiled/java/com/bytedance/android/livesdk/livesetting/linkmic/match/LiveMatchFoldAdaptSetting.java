package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_match_fold_adapt_setting")
public final class LiveMatchFoldAdaptSetting {
    public static final boolean DEFAULT = true;
    public static final LiveMatchFoldAdaptSetting INSTANCE = new LiveMatchFoldAdaptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_fold_adapt_setting", DEFAULT);
    }
}
