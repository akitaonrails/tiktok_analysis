package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("test_enable_broadcast_interaction")
public final class TestEnableBroadcastInteractionSetting {
    public static final boolean DEFAULT = true;
    public static final TestEnableBroadcastInteractionSetting INSTANCE = new TestEnableBroadcastInteractionSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("test_enable_broadcast_interaction", DEFAULT);
    }
}
