package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_preview_mem_leak_opt")
public final class LivePreviewMemLeakOpt {
    public static final LivePreviewMemLeakOpt INSTANCE = new LivePreviewMemLeakOpt();
    public static final boolean DEFAULT = true;

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_preview_mem_leak_opt", DEFAULT);
    }
}
