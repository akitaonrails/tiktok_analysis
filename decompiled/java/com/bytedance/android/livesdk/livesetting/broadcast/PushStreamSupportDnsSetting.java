package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_sdk_enable_pushstream_dns_opt")
public final class PushStreamSupportDnsSetting {
    public static final int DEFAULT = 0;
    public static final int DISABLE = 0;
    public static final int ENABLE = 1;
    public static final PushStreamSupportDnsSetting INSTANCE = new PushStreamSupportDnsSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_sdk_enable_pushstream_dns_opt", DEFAULT) == 1;
    }
}
