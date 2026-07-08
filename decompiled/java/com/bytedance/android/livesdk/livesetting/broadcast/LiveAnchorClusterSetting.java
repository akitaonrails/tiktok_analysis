package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("anchor_cluster_level")
public final class LiveAnchorClusterSetting {
    public static final String DEFAULT = "";
    public static final LiveAnchorClusterSetting INSTANCE = new LiveAnchorClusterSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("anchor_cluster_level", DEFAULT);
    }
}
