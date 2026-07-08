package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_broadcast_single_activity_check_white_list")
public final class LiveBroadcastSingleActivityIllegalMethodCallWhiteList {
    public static final String[] DEFAULT;
    public static final LiveBroadcastSingleActivityIllegalMethodCallWhiteList INSTANCE = new LiveBroadcastSingleActivityIllegalMethodCallWhiteList();
    public static final String[] whiteList;

    public static /* synthetic */ void getWhiteList$annotations() {
    }

    static {
        String[] strArr = {"BillboardV2Fragment", "SkeletonSharePanelFragment"};
        DEFAULT = strArr;
        whiteList = SettingsManager.INSTANCE.getStringArrayValue("live_broadcast_single_activity_check_white_list", strArr);
    }

    public static final String[] getWhiteList() {
        return whiteList;
    }
}
