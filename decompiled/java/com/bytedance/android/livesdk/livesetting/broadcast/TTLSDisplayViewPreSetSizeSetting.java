package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttls_display_view_pre_set_size")
public final class TTLSDisplayViewPreSetSizeSetting {
    public static final int DEFAULT = 0;
    public static final TTLSDisplayViewPreSetSizeSetting INSTANCE = new TTLSDisplayViewPreSetSizeSetting();

    public final boolean enableDisplayViewPreSetSize() {
        return SettingsManager.INSTANCE.getIntValue("ttls_display_view_pre_set_size", DEFAULT) == 1;
    }
}
