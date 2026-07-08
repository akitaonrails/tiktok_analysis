package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "layout_full_screen_end")
public final class LinkMicLayoutFullScreenEnd {
    public static final boolean DEFAULT = false;
    public static final LinkMicLayoutFullScreenEnd INSTANCE = new LinkMicLayoutFullScreenEnd();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("layout_full_screen_end", DEFAULT);
    }
}
