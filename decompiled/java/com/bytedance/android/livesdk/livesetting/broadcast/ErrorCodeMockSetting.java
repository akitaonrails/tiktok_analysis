package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("error_code_for_mock")
public final class ErrorCodeMockSetting {
    public static final int DEFAULT = 0;
    public static final ErrorCodeMockSetting INSTANCE = new ErrorCodeMockSetting();

    public final boolean enableErrorCodeMock() {
        return SettingsManager.INSTANCE.getIntValue("error_code_for_mock", DEFAULT) == 1;
    }
}
