package com.bytedance.android.livesdk.broadcast.preview;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "private_account_disable_gift")
public final class PrivateAccountDisableGiftSetting {
    public static final boolean DEFAULT = true;
    public static final PrivateAccountDisableGiftSetting INSTANCE = new PrivateAccountDisableGiftSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("private_account_disable_gift", DEFAULT);
    }
}
