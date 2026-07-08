package com.bytedance.android.livesdk.livesetting.feed;

import X.C01GW;
import X.C13LQ;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_infeed_toplive_tab_entrance")
public final class LiveInfeedTopliveTabEntranceSetting {
    public static final LiveInfeedTopliveTabEntranceSetting INSTANCE = new LiveInfeedTopliveTabEntranceSetting();
    public static final String[] DEFAULT = {"live_merge_live_cover"};
    public static final C01GW _value$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(60));

    private final String[] get_value() {
        return (String[]) _value$delegate.getValue();
    }

    public final String[] getValue() {
        return get_value();
    }

    public static final boolean matchEntrance(EnterRoomConfig enterRoomConfig) {
        if (LiveSkylightComprehensionSetting.INSTANCE.onlyFyp() || enterRoomConfig == null) {
            return false;
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        return matchEntrance(roomsData.enterFromMerge, roomsData.enterMethod);
    }

    public static final boolean matchEntrance(String str, String str2) {
        if (LiveSkylightComprehensionSetting.INSTANCE.onlyFyp()) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_*");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        LiveInfeedTopliveTabEntranceSetting liveInfeedTopliveTabEntranceSetting = INSTANCE;
        if (!C13LQ.LJIILLIIL(strLIZIZ, liveInfeedTopliveTabEntranceSetting.getValue()) && !C13LQ.LJIILLIIL(strLIZIZ2, liveInfeedTopliveTabEntranceSetting.getValue())) {
            return false;
        }
        return true;
    }
}
