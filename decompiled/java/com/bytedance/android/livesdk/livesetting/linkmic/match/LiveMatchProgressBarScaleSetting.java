package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("match_progress_bar_scale")
public final class LiveMatchProgressBarScaleSetting {
    public static final int DEFAULT = 0;
    public static final LiveMatchProgressBarScaleSetting INSTANCE = new LiveMatchProgressBarScaleSetting();

    public final boolean directReturn() {
        return SettingsManager.INSTANCE.getIntValue("match_progress_bar_scale", DEFAULT) == 1;
    }

    public final boolean fixScale() {
        return SettingsManager.INSTANCE.getIntValue("match_progress_bar_scale", DEFAULT) == 0;
    }

    public final boolean noFixScale() {
        return SettingsManager.INSTANCE.getIntValue("match_progress_bar_scale", DEFAULT) == 2;
    }
}
