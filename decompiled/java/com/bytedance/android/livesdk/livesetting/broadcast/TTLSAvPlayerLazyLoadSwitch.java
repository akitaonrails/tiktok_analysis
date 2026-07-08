package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttls_avplayer_lazy_load")
public final class TTLSAvPlayerLazyLoadSwitch {
    public static final int DEFAULT = 0;
    public static final TTLSAvPlayerLazyLoadSwitch INSTANCE = new TTLSAvPlayerLazyLoadSwitch();

    public final boolean isAvPlayerLazyLoad() {
        return SettingsManager.INSTANCE.getIntValue("ttls_avplayer_lazy_load", DEFAULT) == 1;
    }
}
