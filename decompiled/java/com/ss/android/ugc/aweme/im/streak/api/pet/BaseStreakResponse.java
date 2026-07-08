package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseStreakResponse extends BaseResponse {

    @C09CT("log_pb")
    public final LogPb logPb;

    @C09CT("pet_value")
    public final StreakPetValue petValue;

    @C09CT("timestamp_millis")
    public final Long timestampMillis;

    public BaseStreakResponse() {
        this(null, null, null);
    }

    public BaseStreakResponse(Long l, StreakPetValue streakPetValue, LogPb logPb) {
        this.timestampMillis = l;
        this.petValue = streakPetValue;
        this.logPb = logPb;
    }
}
