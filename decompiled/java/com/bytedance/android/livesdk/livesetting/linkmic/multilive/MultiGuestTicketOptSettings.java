package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_multiguest_score_opt")
public final class MultiGuestTicketOptSettings {
    public static final boolean DEFAULT = true;
    public static final MultiGuestTicketOptSettings INSTANCE = new MultiGuestTicketOptSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_multiguest_score_opt", DEFAULT);
    }
}
