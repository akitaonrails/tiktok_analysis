package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_log_thread_pool_opt")
public final class LiveLogThreadPoolOpt {
    public static final boolean DEFAULT = false;
    public static final LiveLogThreadPoolOpt INSTANCE = new LiveLogThreadPoolOpt();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_log_thread_pool_opt", DEFAULT);
    }
}
