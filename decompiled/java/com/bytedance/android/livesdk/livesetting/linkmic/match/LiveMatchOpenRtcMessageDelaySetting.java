package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("match_open_rtc_msg_delay")
public final class LiveMatchOpenRtcMessageDelaySetting {
    public static final long DEFAULT = 3000;
    public static final LiveMatchOpenRtcMessageDelaySetting INSTANCE = new LiveMatchOpenRtcMessageDelaySetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("match_open_rtc_msg_delay", DEFAULT);
    }
}
