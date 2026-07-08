package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class StreaksPetUpdateResponse extends BaseStreakResponse {

    @C09CT("pet_fe_user_data")
    public final String petFeUserData;

    public StreaksPetUpdateResponse() {
        this("");
    }

    public StreaksPetUpdateResponse(String str) {
        super(null, null, null);
        this.petFeUserData = str;
    }
}
