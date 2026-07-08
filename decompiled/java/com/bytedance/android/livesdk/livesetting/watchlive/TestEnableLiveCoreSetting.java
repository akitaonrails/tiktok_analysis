package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("test_enable_livecore")
public final class TestEnableLiveCoreSetting {
    public static final boolean DEFAULT = true;
    public static final TestEnableLiveCoreSetting INSTANCE = new TestEnableLiveCoreSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("test_enable_livecore", DEFAULT);
    }

    public final boolean disable() {
        return !enable();
    }
}
