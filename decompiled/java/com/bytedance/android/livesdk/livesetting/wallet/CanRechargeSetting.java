package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("can_recharge")
public final class CanRechargeSetting {
    public static final boolean DEFAULT = true;
    public static final CanRechargeSetting INSTANCE = new CanRechargeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("can_recharge", DEFAULT);
    }
}
