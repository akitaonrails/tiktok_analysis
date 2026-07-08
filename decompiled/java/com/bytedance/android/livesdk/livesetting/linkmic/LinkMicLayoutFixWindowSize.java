package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "layout_fix_window_size")
public final class LinkMicLayoutFixWindowSize {
    public static final boolean DEFAULT = true;
    public static final LinkMicLayoutFixWindowSize INSTANCE = new LinkMicLayoutFixWindowSize();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("layout_fix_window_size", DEFAULT);
    }
}
