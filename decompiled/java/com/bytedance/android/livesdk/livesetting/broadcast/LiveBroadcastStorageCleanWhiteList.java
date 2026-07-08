package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_storage_clean_white_list")
public final class LiveBroadcastStorageCleanWhiteList {
    public static final String[] DEFAULT;
    public static final LiveBroadcastStorageCleanWhiteList INSTANCE = new LiveBroadcastStorageCleanWhiteList();
    public static final String[] value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        String[] strArr = new String[0];
        DEFAULT = strArr;
        String[] stringArrayValue = SettingsManager.INSTANCE.getStringArrayValue("live_broadcast_storage_clean_white_list", strArr);
        if (stringArrayValue != null) {
            strArr = stringArrayValue;
        }
        value = strArr;
    }

    public static final String[] getValue() {
        return value;
    }
}
