package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "mix_stream_opt_separate_part2_included")
public final class LinkMicMixStreamOptSeparatePart2Included {
    public static final boolean DEFAULT = false;
    public static final LinkMicMixStreamOptSeparatePart2Included INSTANCE = new LinkMicMixStreamOptSeparatePart2Included();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("mix_stream_opt_separate_part2_included", DEFAULT);
    }
}
