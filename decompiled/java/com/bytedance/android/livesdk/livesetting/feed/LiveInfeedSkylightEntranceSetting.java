package com.bytedance.android.livesdk.livesetting.feed;

import X.C13LQ;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_infeed_skylight_entrance")
public final class LiveInfeedSkylightEntranceSetting {
    public static final LiveInfeedSkylightEntranceSetting INSTANCE = new LiveInfeedSkylightEntranceSetting();
    public static final String[] DEFAULT = {"live_merge_live_cover"};

    private final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_infeed_skylight_entrance", DEFAULT);
    }

    public static final boolean isHangoutRoomPage(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig == null || !Intrinsics.LJFF(enterRoomConfig.mRoomsData.enterMethod, "hangout_live_cell_all") || !HangoutRoomFeedEnableSetting.INSTANCE.isEnable()) {
            return false;
        }
        return true;
    }

    public static final boolean isNearbyPage(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig == null) {
            return false;
        }
        return Intrinsics.LJFF(enterRoomConfig.mRoomsData.enterMethod, "nearby_tab_live_cover");
    }

    public static final boolean isTopLive(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enterRoomConfig.mRoomsData.enterFromMerge);
        sbLIZ.append('_');
        sbLIZ.append(enterRoomConfig.mRoomsData.enterMethod);
        if (!Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), "live_merge_live_cover")) {
            return false;
        }
        return true;
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
        LiveInfeedSkylightEntranceSetting liveInfeedSkylightEntranceSetting = INSTANCE;
        if (!C13LQ.LJIILLIIL(strLIZIZ, liveInfeedSkylightEntranceSetting.getValue()) && !C13LQ.LJIILLIIL(strLIZIZ2, liveInfeedSkylightEntranceSetting.getValue())) {
            return false;
        }
        return true;
    }

    public static final boolean matchNearbyEntrance(String str, String str2) {
        if (LiveSkylightComprehensionSetting.INSTANCE.onlyFyp()) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(strLIZIZ, "live_merge_live_cover") && !Intrinsics.LJFF(strLIZIZ, "homepage_bottom_live_live_cell") && !Intrinsics.LJFF(strLIZIZ, "live_merge_nearby_tab_live_cover")) {
            return false;
        }
        return true;
    }

    public static final boolean matchNearbyFeed(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!Intrinsics.LJFF(strLIZIZ, "live_merge_nearby_module") && !Intrinsics.LJFF(strLIZIZ, "homepage_bottom_live_nearby_module") && !Intrinsics.LJFF(strLIZIZ, "live_merge_nearby_tab_live_cover")) {
            return false;
        }
        return true;
    }
}
