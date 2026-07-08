package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_karaoke_deeplink")
public final class LiveKaraokeDeepLinkSetting {
    public static final int DEFAULT = 0;
    public static final LiveKaraokeDeepLinkSetting INSTANCE = new LiveKaraokeDeepLinkSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_karaoke_deeplink", DEFAULT) > 0;
    }
}
