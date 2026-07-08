package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_manager_coexist_live_studio")
public final class LiveManagerCoexistLiveStudioSetting {
    public static final boolean DEFAULT = false;
    public static final LiveManagerCoexistLiveStudioSetting INSTANCE = new LiveManagerCoexistLiveStudioSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_manager_coexist_live_studio", DEFAULT);
    }
}
