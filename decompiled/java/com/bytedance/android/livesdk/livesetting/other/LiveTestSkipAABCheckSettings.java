package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_test_skip_aab_check")
public final class LiveTestSkipAABCheckSettings {
    public static final boolean DEFAULT = false;
    public static final LiveTestSkipAABCheckSettings INSTANCE = new LiveTestSkipAABCheckSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_test_skip_aab_check", DEFAULT);
    }
}
