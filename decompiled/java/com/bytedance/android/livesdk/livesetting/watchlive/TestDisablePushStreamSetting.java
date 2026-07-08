package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("test_disable_push_stream")
public final class TestDisablePushStreamSetting {
    public static final boolean DEFAULT = false;
    public static final TestDisablePushStreamSetting INSTANCE = new TestDisablePushStreamSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("test_disable_push_stream", DEFAULT);
    }
}
