package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_push_stream_compliance")
public final class LivePushStreamComplianceSetting {
    public static final int DEFAULT = 0;
    public static final LivePushStreamComplianceSetting INSTANCE = new LivePushStreamComplianceSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_push_stream_compliance", DEFAULT) == 1;
    }
}
