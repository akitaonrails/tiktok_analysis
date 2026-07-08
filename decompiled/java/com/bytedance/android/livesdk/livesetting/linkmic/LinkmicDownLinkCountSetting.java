package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_downlink_select_count")
public final class LinkmicDownLinkCountSetting {
    public static final long DEFAULT = 0;
    public static final LinkmicDownLinkCountSetting INSTANCE = new LinkmicDownLinkCountSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("linkmic_downlink_select_count", DEFAULT);
    }
}
