package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("livecore_error_code_for_frontend")
public final class LiveCoreErrorCodeForFrontendSetting {
    public static final int DEFAULT = 0;
    public static final LiveCoreErrorCodeForFrontendSetting INSTANCE = new LiveCoreErrorCodeForFrontendSetting();

    public final int passLiveCoreErrorCode() {
        return SettingsManager.INSTANCE.getIntValue("livecore_error_code_for_frontend", DEFAULT);
    }
}
