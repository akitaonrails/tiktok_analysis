package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C1078730eB5;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_push_guide_to_fyp")
public final class LivePushGuideToFypExperiment {
    public static final LivePushGuideToFypExperiment INSTANCE = new LivePushGuideToFypExperiment();
    public static final LivePushGuideToFypConfig DEFAULT = new LivePushGuideToFypConfig(0, false);
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C1078730eB5());

    public static final boolean autoSwipeToNext() {
        return INSTANCE.getValue().autoSwipeToNext;
    }

    private final LivePushGuideToFypConfig getValue() {
        return (LivePushGuideToFypConfig) value$delegate.getValue();
    }

    public static final int liveRoomCount() {
        return INSTANCE.getValue().liveRoomCount;
    }
}
