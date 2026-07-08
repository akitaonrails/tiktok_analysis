package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_intercept_jump_live_top_activity")
public final class MultiTopLiveInterceptJumpLiveTopActivitySetting {
    public static final String DEFAULT = "com.ss.android.ugc.aweme.main.MainActivity";
    public static final MultiTopLiveInterceptJumpLiveTopActivitySetting INSTANCE = new MultiTopLiveInterceptJumpLiveTopActivitySetting();

    public static final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("multi_top_live_intercept_jump_live_top_activity", DEFAULT);
    }
}
