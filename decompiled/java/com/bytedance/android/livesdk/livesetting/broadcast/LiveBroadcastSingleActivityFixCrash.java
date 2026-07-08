package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_single_activity_fix_crash")
public final class LiveBroadcastSingleActivityFixCrash {
    public static final LiveBroadcastSingleActivityFixCrash INSTANCE = new LiveBroadcastSingleActivityFixCrash();
    public static final boolean DEFAULT = true;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_broadcast_single_activity_fix_crash", true);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
