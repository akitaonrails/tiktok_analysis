package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_rust_manager_setting")
public final class MtLinkMicRustManagerSetting {
    public static final int DEFAULT = 0;
    public static final MtLinkMicRustManagerSetting INSTANCE = new MtLinkMicRustManagerSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_rust_manager_setting", DEFAULT);
    }

    public static final boolean positionEnable() {
        return (INSTANCE.getValue() & 1) == 1;
    }

    public static final boolean userEnable() {
        return (INSTANCE.getValue() & 2) == 2;
    }
}
