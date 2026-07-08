package com.bytedance.android.livesdk.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_user_request_refactor")
public final class LiveUserRequestRefactorSetting {
    public static final LiveUserRequestRefactorSetting INSTANCE = new LiveUserRequestRefactorSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_user_request_refactor", DEFAULT);
    }
}
