package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ec_inner_opt_mode")
public final class LiveEcommerceInnerSetting {
    public static final boolean DEFAULT = false;
    public static final LiveEcommerceInnerSetting INSTANCE = new LiveEcommerceInnerSetting();

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final boolean m123switch() {
        return !SettingsManager.INSTANCE.getBooleanValue("ec_inner_opt_mode", DEFAULT);
    }
}
