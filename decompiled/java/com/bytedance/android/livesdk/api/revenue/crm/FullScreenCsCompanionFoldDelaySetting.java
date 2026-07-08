package com.bytedance.android.livesdk.api.revenue.crm;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("full_screen_cs_companion_fold_delay")
public final class FullScreenCsCompanionFoldDelaySetting {
    public static final int DEFAULT = 5;
    public static final FullScreenCsCompanionFoldDelaySetting INSTANCE = new FullScreenCsCompanionFoldDelaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("full_screen_cs_companion_fold_delay", DEFAULT);
    }
}
