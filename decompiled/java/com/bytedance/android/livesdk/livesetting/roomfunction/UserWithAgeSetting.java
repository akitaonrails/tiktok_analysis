package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("user_with_age")
public final class UserWithAgeSetting {
    public static final boolean DEFAULT = false;
    public static final UserWithAgeSetting INSTANCE = new UserWithAgeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("user_with_age", DEFAULT);
    }
}
