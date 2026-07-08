package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_host_java_max_cache_fix")
public final class LiveHostJavaMaxCacheFix {
    public static final LiveHostJavaMaxCacheFix INSTANCE = new LiveHostJavaMaxCacheFix();
    public static final boolean DEFAULT = true;
    public static final boolean isEnable = SettingsManager.INSTANCE.getBooleanValue("live_host_java_max_cache_fix", true);

    public static /* synthetic */ void isEnable$annotations() {
    }

    public static final boolean isEnable() {
        return isEnable;
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
