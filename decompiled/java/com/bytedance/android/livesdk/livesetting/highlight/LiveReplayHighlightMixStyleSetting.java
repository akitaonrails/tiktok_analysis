package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_fragment_mix_style")
public final class LiveReplayHighlightMixStyleSetting {
    public static final LiveReplayHighlightMixStyleSetting INSTANCE = new LiveReplayHighlightMixStyleSetting();
    public static final int DEFAULT = 1;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_fragment_mix_style", 1);

    public final boolean isV1() {
        return value == 1;
    }

    public final boolean isV2() {
        return value == 2;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
