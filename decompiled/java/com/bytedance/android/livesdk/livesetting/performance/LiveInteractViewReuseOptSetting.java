package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_interact_reuse_opt")
public final class LiveInteractViewReuseOptSetting {
    public static final LiveInteractViewReuseOptSetting INSTANCE = new LiveInteractViewReuseOptSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_interact_reuse_opt", true);

    public final boolean enable() {
        return value;
    }
}
