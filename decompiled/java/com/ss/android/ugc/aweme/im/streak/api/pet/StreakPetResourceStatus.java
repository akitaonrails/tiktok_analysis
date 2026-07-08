package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C06I6;
import X.C09CT;
import com.ss.android.ugc.aweme.im.common.setting.StreakPetResourceDescription;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetResourceStatus {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final C06I6 status;

    @C09CT("resource_description")
    public final StreakPetResourceDescription streakPetResourceDescription;

    public StreakPetResourceStatus() {
        this(null, C06I6.NONE);
    }

    public StreakPetResourceStatus(StreakPetResourceDescription streakPetResourceDescription, C06I6 c06i6) {
        this.streakPetResourceDescription = streakPetResourceDescription;
        this.status = c06i6;
    }
}
