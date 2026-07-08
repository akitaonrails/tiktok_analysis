package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlivestreamer_enable_localtest_throw_exception")
public final class LiveTTLSThrowExceptionSettings {
    public static final boolean DEFAULT = false;
    public static final LiveTTLSThrowExceptionSettings INSTANCE = new LiveTTLSThrowExceptionSettings();

    public final boolean canThrowException() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlivestreamer_enable_localtest_throw_exception", DEFAULT);
    }
}
