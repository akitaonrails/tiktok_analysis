package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("push_stream_url_config")
public final class PushStreamUrlConfig {
    public static final PushStreamUrlConfigData DEFAULT;
    public static final PushStreamUrlConfig INSTANCE = new PushStreamUrlConfig();

    static {
        PushStreamUrlConfigData pushStreamUrlConfigData = PushStreamUrlConfigData.LIZ;
        DEFAULT = PushStreamUrlConfigData.LIZ;
    }

    public final PushStreamUrlConfigData getValue() {
        return (PushStreamUrlConfigData) SettingsManager.INSTANCE.getValueSafely("push_stream_url_config", DEFAULT);
    }

    public final int getCacheSize() {
        PushStreamUrlConfigData value = getValue();
        if (value == null) {
            PushStreamUrlConfigData pushStreamUrlConfigData = PushStreamUrlConfigData.LIZ;
            value = PushStreamUrlConfigData.LIZ;
        }
        return value.cacheSize;
    }

    public final int getExpireTime() {
        PushStreamUrlConfigData value = getValue();
        if (value == null) {
            PushStreamUrlConfigData pushStreamUrlConfigData = PushStreamUrlConfigData.LIZ;
            value = PushStreamUrlConfigData.LIZ;
        }
        return value.expireTime;
    }

    public final PushStreamUrlConfigData getDEFAULT() {
        return DEFAULT;
    }
}
