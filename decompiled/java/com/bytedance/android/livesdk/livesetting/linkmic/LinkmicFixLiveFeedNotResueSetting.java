package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_live_feed_not_resue")
public final class LinkmicFixLiveFeedNotResueSetting {
    public static final boolean DEFAULT = true;
    public static final LinkmicFixLiveFeedNotResueSetting INSTANCE = new LinkmicFixLiveFeedNotResueSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_live_feed_not_resue", DEFAULT);
    }
}
