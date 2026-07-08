package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "mix_stream_opt_separate")
public final class LinkMicMixStreamOptSeparate {
    public static final boolean DEFAULT = false;
    public static final LinkMicMixStreamOptSeparate INSTANCE = new LinkMicMixStreamOptSeparate();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("mix_stream_opt_separate", DEFAULT);
    }
}
