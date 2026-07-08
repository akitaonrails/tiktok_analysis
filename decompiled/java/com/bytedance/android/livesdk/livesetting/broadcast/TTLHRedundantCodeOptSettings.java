package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_redundant_code_opt_settings")
public final class TTLHRedundantCodeOptSettings {
    public static final int DEFAULT = 0;
    public static final TTLHRedundantCodeOptSettings INSTANCE = new TTLHRedundantCodeOptSettings();

    public final int enabled() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_redundant_code_opt_settings", DEFAULT);
    }
}
