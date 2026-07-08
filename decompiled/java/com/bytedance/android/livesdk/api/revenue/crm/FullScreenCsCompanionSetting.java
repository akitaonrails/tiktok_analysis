package com.bytedance.android.livesdk.api.revenue.crm;

import X.C354201Zc;
import X.C751980Tee;
import X.C781520UlC;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "full_screen_optimization")
public final class FullScreenCsCompanionSetting {
    public static final int DEFAULT = 0;
    public static final int GOAL = 1;
    public static final int GOAL_WITH_TOPIC_TAG = 2;
    public static final FullScreenCsCompanionSetting INSTANCE = new FullScreenCsCompanionSetting();

    public final int getValue(DataChannel dataChannel) {
        LiveMode liveMode;
        if ((dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null && C354201Zc.LIZLLL(liveMode)) || C781520UlC.LIZJ(C751980Tee.LIZJ(dataChannel))) {
            return 0;
        }
        return SettingsManager.INSTANCE.getIntValue("full_screen_optimization", DEFAULT);
    }
}
