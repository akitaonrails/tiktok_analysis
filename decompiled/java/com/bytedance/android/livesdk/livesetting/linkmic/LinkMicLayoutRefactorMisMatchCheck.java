package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_layout_refactor_mis_match_check")
public final class LinkMicLayoutRefactorMisMatchCheck {
    public static final boolean DEFAULT = true;
    public static final LinkMicLayoutRefactorMisMatchCheck INSTANCE = new LinkMicLayoutRefactorMisMatchCheck();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_layout_refactor_mis_match_check", DEFAULT);
    }
}
