package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("cohost_arch_version")
public final class CohostServerOptVersionSetting {
    public static final int DEFAULT = 0;
    public static final CohostServerOptVersionSetting INSTANCE = new CohostServerOptVersionSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("cohost_arch_version", DEFAULT);
    }
}
