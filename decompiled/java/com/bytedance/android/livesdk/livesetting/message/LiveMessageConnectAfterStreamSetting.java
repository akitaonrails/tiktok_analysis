package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_message_connect_after_stream")
public final class LiveMessageConnectAfterStreamSetting {
    public static final LiveMessageConnectAfterStreamConfig DEFAULT;
    public static final LiveMessageConnectAfterStreamSetting INSTANCE = new LiveMessageConnectAfterStreamSetting();
    public static LiveMessageConnectAfterStreamConfig value;

    static {
        LiveMessageConnectAfterStreamConfig liveMessageConnectAfterStreamConfig = new LiveMessageConnectAfterStreamConfig();
        DEFAULT = liveMessageConnectAfterStreamConfig;
        value = (LiveMessageConnectAfterStreamConfig) SettingsManager.INSTANCE.getValueSafely("live_message_connect_after_stream", liveMessageConnectAfterStreamConfig);
    }

    public final boolean enable() {
        LiveMessageConnectAfterStreamConfig liveMessageConnectAfterStreamConfig = value;
        if (liveMessageConnectAfterStreamConfig == null) {
            liveMessageConnectAfterStreamConfig = DEFAULT;
        }
        return liveMessageConnectAfterStreamConfig.enable;
    }

    public final int needNqeLowerThanEqual() {
        LiveMessageConnectAfterStreamConfig liveMessageConnectAfterStreamConfig = value;
        if (liveMessageConnectAfterStreamConfig == null) {
            liveMessageConnectAfterStreamConfig = DEFAULT;
        }
        return liveMessageConnectAfterStreamConfig.needNqeLowerThanEqual;
    }

    public final long timeout() {
        LiveMessageConnectAfterStreamConfig liveMessageConnectAfterStreamConfig = value;
        if (liveMessageConnectAfterStreamConfig == null) {
            liveMessageConnectAfterStreamConfig = DEFAULT;
        }
        return liveMessageConnectAfterStreamConfig.timeout;
    }
}
