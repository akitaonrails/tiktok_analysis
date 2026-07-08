package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey(preciseExperiment = false, value = "key_api_success_rate_opt")
public final class LiveKeyApiOpt {
    public static final LiveKeyApiOpt INSTANCE = new LiveKeyApiOpt();
    public static final EnterOptConfig DEFAULT = new EnterOptConfig(false, false, false, false, false, false, false, true, 2000, LivePreCreateNextRoomPlayer.ENABLE);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(101));

    public static final boolean enableFeedApiHighPriority() {
        return INSTANCE.getConfig().enableFeedApiHighPriority;
    }

    public static final boolean enableRoomEnterHighPriority() {
        return INSTANCE.getConfig().enableRoomEnterHighPriority;
    }

    private final EnterOptConfig getConfig() {
        return (EnterOptConfig) config$delegate.getValue();
    }

    public static final long getRoomEnterCpuBoostDebounceMs() {
        int i = INSTANCE.getConfig().roomEnterCpuBoostDebounceMs;
        if (i < 0) {
            i = 0;
        }
        return i;
    }

    public static final long getRoomEnterCpuBoostTimeoutMs() {
        int i = INSTANCE.getConfig().roomEnterCpuBoostTimeoutMs;
        if (i < 0) {
            i = 0;
        }
        return i;
    }

    public static final boolean isEnableFeedApiOpt() {
        return INSTANCE.getConfig().enableFeedApiOpt;
    }

    public static final boolean isEnableMainFirstOpt() {
        return INSTANCE.getConfig().enableMainFirstOpt;
    }

    public static final boolean isEnableRetry() {
        return INSTANCE.getConfig().enableRetry;
    }

    public static final boolean isEnableRoomEnterBindBigCore() {
        return INSTANCE.getConfig().roomEnterBindBigCore;
    }

    public static final boolean isEnableRoomEnterCpuBoost() {
        return INSTANCE.getConfig().enableRoomEnterCpuBoost;
    }

    public static final boolean isEnableRoomEnterThreadBoost() {
        return INSTANCE.getConfig().enableThrHighPriority;
    }
}
