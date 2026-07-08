package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("link_mic_cohost_will_join_crash_fix")
public final class LinkMicCohostWillJoinCrashFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicCohostWillJoinCrashFix INSTANCE = new LinkMicCohostWillJoinCrashFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("link_mic_cohost_will_join_crash_fix", DEFAULT);
    }
}
