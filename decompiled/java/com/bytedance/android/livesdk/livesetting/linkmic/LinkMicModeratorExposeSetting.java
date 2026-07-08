package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_moderator_item_exp_opt")
public final class LinkMicModeratorExposeSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicModeratorExposeSetting INSTANCE = new LinkMicModeratorExposeSetting();

    public final boolean opt() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_moderator_item_exp_opt", DEFAULT);
    }
}
