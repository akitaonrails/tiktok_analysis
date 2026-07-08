package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_mt_mock_landscape")
public final class LiveMtMockLandscapeSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMtMockLandscapeSetting INSTANCE = new LiveMtMockLandscapeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_mt_mock_landscape", DEFAULT);
    }
}
