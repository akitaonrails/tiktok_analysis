package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_layout_params_start_caching_call_count")
public final class LiveLayoutParamsStartCachingCallCountSetting {
    public static final int DEFAULT = 2;
    public static final LiveLayoutParamsStartCachingCallCountSetting INSTANCE = new LiveLayoutParamsStartCachingCallCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_layout_params_start_caching_call_count", DEFAULT);
    }
}
