package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "link_mic_moderator_item_action_opt")
public final class LinkMicModeratorClickSetting {
    public static final boolean DEFAULT = true;
    public static final LinkMicModeratorClickSetting INSTANCE = new LinkMicModeratorClickSetting();

    public final boolean opt() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_moderator_item_action_opt", DEFAULT);
    }
}
