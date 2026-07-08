package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_update_local_linked_list")
public final class LinkMicFixUpdateLocalLinkedList {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixUpdateLocalLinkedList INSTANCE = new LinkMicFixUpdateLocalLinkedList();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_update_local_linked_list", DEFAULT);
    }
}
