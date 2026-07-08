package com.bytedance.android.livesdk.livesetting.other;

import X.C01GW;
import X.C452501pT;
import X.C483450Ixb;
import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "collect_live_survey_features")
public final class LiveSurveyFeaturesSetting {
    public static final LiveSurveyFeaturesSetting INSTANCE = new LiveSurveyFeaturesSetting();
    public static final LiveSurveyFeaturesConfig DEFAULT = new LiveSurveyFeaturesConfig(false, false, false, 100, 50, 10800, 100, 10800);
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C483450Ixb());

    private final LiveSurveyFeaturesConfig getValue() {
        return (LiveSurveyFeaturesConfig) value$delegate.getValue();
    }

    public final boolean enableFullScreenSurvey() {
        return getValue().enableFullScreenSurvey;
    }

    public final boolean enableGlobalSurvey() {
        return getValue().enableGlobalSurvey;
    }

    public final boolean enableLightSurvey() {
        return getValue().enableLightSurvey;
    }

    public final int maxFypAwemeCount() {
        return getValue().maxFypAwemeCount;
    }

    public final int maxFypLiveCardCount() {
        return getValue().maxFypLiveCardCount;
    }

    public final long maxFypLiveCardDuration() {
        return getValue().maxFypLiveCardDuration;
    }

    public final int maxLiveRoomCount() {
        return getValue().maxLiveRoomCount;
    }

    public final long maxLiveRoomDuration() {
        return getValue().maxLiveRoomDuration;
    }
}
