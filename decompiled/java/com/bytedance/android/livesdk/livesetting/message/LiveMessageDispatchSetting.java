package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
@SettingsKey("live_message_dispatch_config")
public final class LiveMessageDispatchSetting {
    public static final LiveMessageDispatchConfig DEFAULT;
    public static final LiveMessageDispatchSetting INSTANCE = new LiveMessageDispatchSetting();
    public static LiveMessageDispatchConfig liveMessageDispatchConfig;

    static {
        LiveMessageDispatchConfig liveMessageDispatchConfig2 = new LiveMessageDispatchConfig(false, false, new ArrayList(), new ArrayList(), new ArrayList(), 10L, 1, 50L, 3, 50L, 8, -1, -1, 8, false, false, false);
        DEFAULT = liveMessageDispatchConfig2;
        LiveMessageDispatchConfig liveMessageDispatchConfig3 = (LiveMessageDispatchConfig) SettingsManager.INSTANCE.getValueSafely("live_message_dispatch_config", liveMessageDispatchConfig2);
        if (liveMessageDispatchConfig3 != null) {
            liveMessageDispatchConfig2 = liveMessageDispatchConfig3;
        }
        liveMessageDispatchConfig = liveMessageDispatchConfig2;
    }

    public final List<String> byPassDispatchAllowList() {
        return liveMessageDispatchConfig.byPassDispatchAllowList;
    }

    public final List<String> directDispatchAllowList() {
        return liveMessageDispatchConfig.directDispatchAllowList;
    }

    public final List<String> directDispatchP2pBlockList() {
        return liveMessageDispatchConfig.directDispatchP2pBlockList;
    }

    public final boolean directDispatchP2pMsg() {
        return liveMessageDispatchConfig.directDispatchP2pMsg;
    }

    public final int dispatchDynamicDuration() {
        return liveMessageDispatchConfig.dispatchDynamicDuration;
    }

    public final int dispatchLimitDuration() {
        return liveMessageDispatchConfig.dispatchLimitDuration;
    }

    public final long dispatchMessageTimeout() {
        return liveMessageDispatchConfig.dispatchMessageTimeout;
    }

    public final int dispatchStrategy() {
        return liveMessageDispatchConfig.dispatchStrategy;
    }

    public final boolean enableAsyncDispatch() {
        return liveMessageDispatchConfig.enableAsyncDispatch;
    }

    public final boolean enableDispatchListOptimize() {
        return liveMessageDispatchConfig.enableDispatchListOptimize;
    }

    public final boolean enableInactiveOpt() {
        return liveMessageDispatchConfig.enableInactiveOpt;
    }

    public final long fixreqDispatchInterval() {
        return liveMessageDispatchConfig.fixfreqDispatchInterval;
    }

    public final int fixreqDispatchSize() {
        return liveMessageDispatchConfig.fixfreqDispatchSize;
    }

    public final int fixreqMaxQueueSize() {
        return liveMessageDispatchConfig.fixfreqMaxQueueSize;
    }

    public final int optwindowMinDispatchSize() {
        return liveMessageDispatchConfig.optwindowMinDispatchSize;
    }

    public final long optwindowWindowTime() {
        return liveMessageDispatchConfig.optwindowWindowTime;
    }

    public final boolean smoothDispatchOptimize() {
        return liveMessageDispatchConfig.smoothDispatchOptimize;
    }
}
