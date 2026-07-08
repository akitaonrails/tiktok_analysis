package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_resume_fix_switch")
public final class LiveMatchResumeFix {
    public static final boolean DEFAULT = true;
    public static final LiveMatchResumeFix INSTANCE = new LiveMatchResumeFix();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_resume_fix_switch", DEFAULT);
    }
}
