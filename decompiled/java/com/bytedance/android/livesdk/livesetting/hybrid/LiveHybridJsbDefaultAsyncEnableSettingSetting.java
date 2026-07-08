package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_jsb_default_async_enable_setting")
public final class LiveHybridJsbDefaultAsyncEnableSettingSetting {
    public static final boolean DEFAULT = false;
    public static final LiveHybridJsbDefaultAsyncEnableSettingSetting INSTANCE = new LiveHybridJsbDefaultAsyncEnableSettingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_hybrid_jsb_default_async_enable_setting", DEFAULT);
    }
}
