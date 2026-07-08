package com.bytedance.android.livesdk.livesetting.performance;

import X.C13LQ;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_click_exit_room_player_opt_list")
public final class LiveClickExitRoomPlayerOptSetting {
    public static final String[] DEFAULT;
    public static final LiveClickExitRoomPlayerOptSetting INSTANCE = new LiveClickExitRoomPlayerOptSetting();
    public static final String[] value;

    static {
        String[] strArr = {"deal_live_cell"};
        DEFAULT = strArr;
        value = SettingsManager.INSTANCE.getStringArrayValue("live_click_exit_room_player_opt_list", strArr);
    }

    public final boolean matchEntrance(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig == null) {
            return false;
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        return matchEntrance(roomsData.enterFromMerge, roomsData.enterMethod);
    }

    public final boolean matchEntrance(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_*");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        String[] strArr = value;
        if (!C13LQ.LJIILLIIL(strLIZIZ, strArr) && !C13LQ.LJIILLIIL(strLIZIZ2, strArr)) {
            return false;
        }
        return true;
    }
}
