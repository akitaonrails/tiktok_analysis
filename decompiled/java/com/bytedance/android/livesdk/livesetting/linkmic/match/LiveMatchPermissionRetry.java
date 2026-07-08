package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("enable_match_permission_retry")
public final class LiveMatchPermissionRetry {
    public static final boolean DEFAULT = false;
    public static final LiveMatchPermissionRetry INSTANCE = new LiveMatchPermissionRetry();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_match_permission_retry", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
