package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("test_enable_effect")
public final class TestEnableEffectSetting {
    public static final boolean DEFAULT = true;
    public static final TestEnableEffectSetting INSTANCE = new TestEnableEffectSetting();

    public final boolean disable() {
        return !SettingsManager.INSTANCE.getBooleanValue("test_enable_effect", DEFAULT);
    }
}
