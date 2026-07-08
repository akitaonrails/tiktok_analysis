package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_stream_enable_fatal_error_opt")
public final class LiveStreamEnableFatalErrorOpt {
    public static final boolean DEFAULT = false;
    public static final LiveStreamEnableFatalErrorOpt INSTANCE = new LiveStreamEnableFatalErrorOpt();

    public final boolean getEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("live_stream_enable_fatal_error_opt", DEFAULT);
    }
}
