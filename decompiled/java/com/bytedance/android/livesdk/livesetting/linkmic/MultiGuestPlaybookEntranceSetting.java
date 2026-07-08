package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_multiguest_anchor_panel_funkit_entrance")
public final class MultiGuestPlaybookEntranceSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestPlaybookEntranceSetting INSTANCE = new MultiGuestPlaybookEntranceSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_multiguest_anchor_panel_funkit_entrance", DEFAULT);
    }
}
