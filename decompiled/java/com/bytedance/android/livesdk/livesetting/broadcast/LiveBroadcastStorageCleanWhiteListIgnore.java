package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_storage_clean_white_list_ignore")
public final class LiveBroadcastStorageCleanWhiteListIgnore {
    public static final LiveBroadcastStorageCleanWhiteListIgnore INSTANCE = new LiveBroadcastStorageCleanWhiteListIgnore();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_broadcast_storage_clean_white_list_ignore", DEFAULT);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final boolean getValue() {
        return value;
    }
}
