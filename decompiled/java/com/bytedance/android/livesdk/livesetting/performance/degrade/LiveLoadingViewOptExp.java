package com.bytedance.android.livesdk.livesetting.performance.degrade;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_loading_view_opt_exp")
public final class LiveLoadingViewOptExp {
    public static final boolean ENABLE = true;
    public static final LiveLoadingViewOptExp INSTANCE = new LiveLoadingViewOptExp();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("live_loading_view_opt_exp", DEFAULT);

    public static final boolean isRetain() {
        return !enable;
    }

    public final boolean getEnable() {
        return enable;
    }
}
