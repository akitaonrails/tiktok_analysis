package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_karaok_search_delay_ms")
public final class LiveKaraokeSearchDelaySetting {
    public static final long DEFAULT = 300;
    public static final LiveKaraokeSearchDelaySetting INSTANCE = new LiveKaraokeSearchDelaySetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("live_host_karaok_search_delay_ms", DEFAULT);
    }
}
