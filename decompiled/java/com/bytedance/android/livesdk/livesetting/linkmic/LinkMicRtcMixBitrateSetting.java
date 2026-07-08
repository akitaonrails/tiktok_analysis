package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_rtc_mix_bitrate")
public final class LinkMicRtcMixBitrateSetting {
    public static final int DEFAULT = 1200;
    public static final LinkMicRtcMixBitrateSetting INSTANCE = new LinkMicRtcMixBitrateSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_rtc_mix_bitrate", DEFAULT);
    }
}
