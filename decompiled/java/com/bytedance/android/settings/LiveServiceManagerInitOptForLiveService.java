package com.bytedance.android.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_service_manager_init_opt_for_live_service")
public final class LiveServiceManagerInitOptForLiveService {
    public static final boolean DEFAULT = true;
    public static final LiveServiceManagerInitOptForLiveService INSTANCE = new LiveServiceManagerInitOptForLiveService();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_service_manager_init_opt_for_live_service", DEFAULT);
    }
}
