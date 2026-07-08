package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_enable_1080p_downgrade_480p")
public final class TTLHEnable1080pDowngrade480p {
    public static final int DEFAULT = 0;
    public static final TTLHEnable1080pDowngrade480p INSTANCE = new TTLHEnable1080pDowngrade480p();

    public final int value() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_enable_1080p_downgrade_480p", DEFAULT);
    }
}
