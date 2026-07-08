package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSurveyFeaturesConfig {
    public static final TypeAdapter ADAPTER = new LiveSurveyFeaturesConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_full_screen_survey")
    public boolean enableFullScreenSurvey;

    @C09CT("enable_global_survey")
    public boolean enableGlobalSurvey;

    @C09CT("enable_light_survey")
    public boolean enableLightSurvey;

    @C09CT("max_fyp_aweme_count")
    public int maxFypAwemeCount;

    @C09CT("max_fyp_live_card_count")
    public int maxFypLiveCardCount;

    @C09CT("max_fyp_live_card_duration")
    public long maxFypLiveCardDuration;

    @C09CT("max_live_room_count")
    public int maxLiveRoomCount;

    @C09CT("max_live_room_duration")
    public long maxLiveRoomDuration;

    public LiveSurveyFeaturesConfig() {
        this(false, false, false, 100, 50, 10800L, 100, 10800L);
    }

    public LiveSurveyFeaturesConfig(boolean z, boolean z2, boolean z3, int i, int i2, long j, int i3, long j2) {
        this.enableGlobalSurvey = z;
        this.enableFullScreenSurvey = z2;
        this.enableLightSurvey = z3;
        this.maxFypAwemeCount = i;
        this.maxFypLiveCardCount = i2;
        this.maxFypLiveCardDuration = j;
        this.maxLiveRoomCount = i3;
        this.maxLiveRoomDuration = j2;
    }
}
