package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_change_record_score_to_ttlh")
public final class LiveBroadcastChangeRecordScoreToTTLH {
    public static final LiveBroadcastChangeRecordScoreToTTLH INSTANCE = new LiveBroadcastChangeRecordScoreToTTLH();
    public static final boolean DEFAULT = true;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_broadcast_change_record_score_to_ttlh", true);

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return enable;
    }
}
