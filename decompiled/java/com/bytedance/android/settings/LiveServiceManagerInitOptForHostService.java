package com.bytedance.android.settings;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_service_manager_init_opt_for_host_service")
public final class LiveServiceManagerInitOptForHostService {
    public static final boolean DEFAULT = false;
    public static final LiveServiceManagerInitOptForHostService INSTANCE = new LiveServiceManagerInitOptForHostService();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_service_manager_init_opt_for_host_service", DEFAULT);
    }
}
