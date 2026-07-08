package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("test_enable_broadcast")
public final class TestEnableBroadcastSetting {
    public static final boolean DEFAULT = true;
    public static final TestEnableBroadcastSetting INSTANCE = new TestEnableBroadcastSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("test_enable_broadcast", DEFAULT);
    }
}
