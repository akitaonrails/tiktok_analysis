package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_fix_clear_cross_linked_list")
public final class LinkMicFixClearCrossLinkedList {
    public static final boolean DEFAULT = true;
    public static final LinkMicFixClearCrossLinkedList INSTANCE = new LinkMicFixClearCrossLinkedList();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_fix_clear_cross_linked_list", DEFAULT);
    }
}
