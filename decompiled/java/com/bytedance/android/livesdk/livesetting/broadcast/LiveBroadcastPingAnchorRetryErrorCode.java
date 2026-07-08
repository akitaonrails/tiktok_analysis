package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_background_ping_anchor_retry_list")
public final class LiveBroadcastPingAnchorRetryErrorCode {
    public static final String[] DEFAULT;
    public static final LiveBroadcastPingAnchorRetryErrorCode INSTANCE = new LiveBroadcastPingAnchorRetryErrorCode();
    public static final String[] value;

    public static /* synthetic */ void getValue$annotations() {
    }

    static {
        String[] strArr = {"4003149"};
        DEFAULT = strArr;
        value = SettingsManager.INSTANCE.getStringArrayValue("live_background_ping_anchor_retry_list", strArr);
    }

    public static final String[] getValue() {
        return value;
    }
}
