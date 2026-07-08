package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_end_page_open_new_saa")
public final class LiveBroadcastEndPageOpenNewSAA {
    public static final LiveBroadcastEndPageOpenNewSAA INSTANCE = new LiveBroadcastEndPageOpenNewSAA();
    public static final boolean DEFAULT = true;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_broadcast_end_page_open_new_saa", true);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
