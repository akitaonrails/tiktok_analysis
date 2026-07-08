package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_fix_resolve_error_context")
public final class LiveHostFixResolveErrorSetting {
    public static final boolean DEFAULT = true;
    public static final LiveHostFixResolveErrorSetting INSTANCE = new LiveHostFixResolveErrorSetting();

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_host_fix_resolve_error_context", DEFAULT);
    }
}
