package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_mix_stream_crash_fix")
public final class LinkMicMixStreamCrashFix {
    public static final boolean DEFAULT = true;
    public static final LinkMicMixStreamCrashFix INSTANCE = new LinkMicMixStreamCrashFix();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_mix_stream_crash_fix", DEFAULT);
    }
}
