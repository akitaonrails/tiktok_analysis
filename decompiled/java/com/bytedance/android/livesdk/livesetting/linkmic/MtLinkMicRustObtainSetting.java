package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_rust_session_obtain")
public final class MtLinkMicRustObtainSetting {
    public static final int DEFAULT = 1;
    public static final MtLinkMicRustObtainSetting INSTANCE = new MtLinkMicRustObtainSetting();

    public static final boolean obtainByPluginCheck() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_rust_session_obtain", DEFAULT) > 0;
    }

    public static final boolean obtainBySoCheck() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_rust_session_obtain", DEFAULT) > 1;
    }
}
