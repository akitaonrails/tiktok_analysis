package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_bug_fix_ratio_opt_close")
public final class LinkMicBugFixRatioOptCloseSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicBugFixRatioOptCloseSetting INSTANCE = new LinkMicBugFixRatioOptCloseSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_bug_fix_ratio_opt_close", DEFAULT);
    }
}
