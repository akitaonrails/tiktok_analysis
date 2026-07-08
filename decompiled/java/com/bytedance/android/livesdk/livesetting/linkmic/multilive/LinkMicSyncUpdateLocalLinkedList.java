package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_sei_sync_update_local_linked_list")
public final class LinkMicSyncUpdateLocalLinkedList {
    public static final LinkMicSyncUpdateLocalLinkedList INSTANCE = new LinkMicSyncUpdateLocalLinkedList();
    public static final int DEFAULT = 1;

    public static final boolean isEnable() {
        return INSTANCE.getValue() > 0;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_sei_sync_update_local_linked_list", DEFAULT);
    }
}
