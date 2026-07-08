package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_karaok_enable")
public final class LiveKaraokeSetting {
    public static final int DEFAULT = 0;
    public static final LiveKaraokeSetting INSTANCE = new LiveKaraokeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_host_karaok_enable", DEFAULT) == 1 && CoinForbidLiveKaraokeSetting.INSTANCE.enable();
    }
}
