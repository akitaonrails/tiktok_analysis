package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("multi_linkmic_fps")
public final class MultiGuestV3FpsSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestV3FpsSetting INSTANCE = new MultiGuestV3FpsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_linkmic_fps", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() > 0;
    }
}
