package com.bytedance.android.livesdk.livesetting.feed;

import X.C13LQ;
import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_infeed_skylight_entrance_auto_expand")
public final class LiveInfeedSkylightEntranceAutoExpandSetting {
    public static final LiveInfeedSkylightEntranceAutoExpandSetting INSTANCE = new LiveInfeedSkylightEntranceAutoExpandSetting();
    public static final String[] DEFAULT = {"live_merge_live_cover"};

    private final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_infeed_skylight_entrance_auto_expand", DEFAULT);
    }

    public final boolean matchEntrance(EnterRoomConfig enterRoomConfig) {
        if (enterRoomConfig == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enterRoomConfig.mRoomsData.enterFromMerge);
        sbLIZ.append('_');
        sbLIZ.append(enterRoomConfig.mRoomsData.enterMethod);
        return matchEntrance(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean matchEntrance(String str) {
        return C13LQ.LJIILLIIL(str, getValue());
    }
}
