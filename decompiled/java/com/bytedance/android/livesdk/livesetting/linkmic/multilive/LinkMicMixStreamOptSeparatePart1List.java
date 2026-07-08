package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "mix_stream_opt_separate_part1_list")
public final class LinkMicMixStreamOptSeparatePart1List {
    public static final LinkMicMixStreamOptSeparatePart1List INSTANCE = new LinkMicMixStreamOptSeparatePart1List();
    public static final String[] DEFAULT = {"full_screen", "full_screen_half"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("mix_stream_opt_separate_part1_list", DEFAULT);
    }
}
