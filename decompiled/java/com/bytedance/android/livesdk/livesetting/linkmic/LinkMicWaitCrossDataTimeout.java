package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_wait_cross_data_timeout")
public final class LinkMicWaitCrossDataTimeout {
    public static final int DEFAULT = 5;
    public static final LinkMicWaitCrossDataTimeout INSTANCE = new LinkMicWaitCrossDataTimeout();

    public static final int getConfig() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_wait_cross_data_timeout", DEFAULT);
    }
}
