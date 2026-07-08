package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("error_code_for_frontend")
public final class ErrorCodeForFrontendSetting {
    public static final int DEFAULT = 0;
    public static final ErrorCodeForFrontendSetting INSTANCE = new ErrorCodeForFrontendSetting();

    public final int passErrorCode() {
        return SettingsManager.INSTANCE.getIntValue("error_code_for_frontend", DEFAULT);
    }
}
