package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "enable_live_finishpage_highlight_preload")
public final class LiveEndPageHighlightPreloadEnable {
    public static final boolean DEFAULT = false;
    public static final LiveEndPageHighlightPreloadEnable INSTANCE = new LiveEndPageHighlightPreloadEnable();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_live_finishpage_highlight_preload", DEFAULT);
    }
}
