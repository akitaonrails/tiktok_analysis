package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_fix_linked_state")
public final class LinkMicFixLinkedState {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixLinkedState INSTANCE = new LinkMicFixLinkedState();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("livesdk_linkmic_fix_linked_state", DEFAULT);
    }
}
