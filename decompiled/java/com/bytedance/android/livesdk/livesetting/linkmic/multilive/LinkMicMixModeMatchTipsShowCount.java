package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_mix_mode_match_tips_show_count")
public final class LinkMicMixModeMatchTipsShowCount {
    public static final int DEFAULT = 3;
    public static final LinkMicMixModeMatchTipsShowCount INSTANCE = new LinkMicMixModeMatchTipsShowCount();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("link_mic_mix_mode_match_tips_show_count", DEFAULT);
    }
}
