package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_pre_create_next_room_by_device_exp")
public final class LivePreCreateNextRoomByDeviceExp {
    public static final LivePreCreateNextRoomByDeviceExp INSTANCE = new LivePreCreateNextRoomByDeviceExp();
    public static final LivePreCreateNextRoomByDeviceExpConfig DEFAULT = new LivePreCreateNextRoomByDeviceExpConfig(false, 0, null, 7, null);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(91));
    public static final C01GW deviceScore$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(93));
    public static final C01GW delayTimeMs$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(92));

    public static /* synthetic */ void getDelayTimeMs$annotations() {
    }

    private final LivePreCreateNextRoomByDeviceExpConfig getConfig() {
        return (LivePreCreateNextRoomByDeviceExpConfig) config$delegate.getValue();
    }

    public static final int getDelayTimeMs() {
        return ((Number) delayTimeMs$delegate.getValue()).intValue();
    }

    private final float getDeviceScore() {
        return ((Number) deviceScore$delegate.getValue()).floatValue();
    }

    public static final boolean isEnabled() {
        return INSTANCE.getConfig().getEnable();
    }

    public final int getDelayTimeByPerformanceScore() {
        if (getDeviceScore() == 0.0f) {
            return -1;
        }
        if (!getConfig().getEnable()) {
            return getConfig().getDefaultDelayMs();
        }
        for (PerformanceScoreIntervalConfig performanceScoreIntervalConfig : getConfig().getScoreIntervals()) {
            if (getDeviceScore() >= performanceScoreIntervalConfig.getMinScore() && getDeviceScore() < performanceScoreIntervalConfig.getMaxScore()) {
                return performanceScoreIntervalConfig.getDelayTimeMs();
            }
        }
        return getConfig().getDefaultDelayMs();
    }
}
