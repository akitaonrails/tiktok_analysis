package com.bytedance.android.livesdk.livesetting.message;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_room_check_alive")
public final class LiveRoomCheckAliveSetting {
    public static final LiveRoomCheckAliveSetting INSTANCE = new LiveRoomCheckAliveSetting();
    public static final LiveRoomCheckAliveConfig DEFAULT = new LiveRoomCheckAliveConfig(false, false);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(74));

    private final LiveRoomCheckAliveConfig getConfig() {
        return (LiveRoomCheckAliveConfig) config$delegate.getValue();
    }

    public final boolean checkNR() {
        return getConfig().checkNR;
    }

    public final boolean checkPausing() {
        return getConfig().checkPausing;
    }
}
