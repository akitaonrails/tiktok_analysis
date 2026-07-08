package com.bytedance.android.livesdk.livesetting.highlight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_highlight_add_subtitle_enable")
public final class LiveHighlightAddSubtitleSetting {
    public static final int DEFAULT = 0;
    public static final LiveHighlightAddSubtitleSetting INSTANCE = new LiveHighlightAddSubtitleSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_highlight_add_subtitle_enable", DEFAULT) > 0;
    }
}
