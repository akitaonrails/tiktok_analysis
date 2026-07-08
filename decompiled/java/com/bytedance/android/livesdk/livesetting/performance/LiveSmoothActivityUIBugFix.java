package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_smooth_activity_ui_bug_fix")
public final class LiveSmoothActivityUIBugFix {
    public static final boolean DEFAULT = true;
    public static final LiveSmoothActivityUIBugFix INSTANCE = new LiveSmoothActivityUIBugFix();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_smooth_activity_ui_bug_fix", DEFAULT);
    }
}
