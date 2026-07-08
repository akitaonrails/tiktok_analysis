package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_remove_get_state_when_empty")
public final class LinkMicRemoveGetStateWhenEmpty {
    public static final boolean DEFAULT = true;
    public static final LinkMicRemoveGetStateWhenEmpty INSTANCE = new LinkMicRemoveGetStateWhenEmpty();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_remove_get_state_when_empty", DEFAULT);
    }
}
