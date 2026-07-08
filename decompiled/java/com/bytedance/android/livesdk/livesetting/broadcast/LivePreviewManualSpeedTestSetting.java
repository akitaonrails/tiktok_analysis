package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_manual_probe_switch")
public final class LivePreviewManualSpeedTestSetting {
    public static final int DEFAULT = 1;
    public static final LivePreviewManualSpeedTestSetting INSTANCE = new LivePreviewManualSpeedTestSetting();

    public final int getValue() {
        return 1;
    }

    public final boolean enabled() {
        return getValue() > 0;
    }
}
