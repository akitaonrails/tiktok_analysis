package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetResourceInfo {

    @C09CT("streak_pet_resource_status_list")
    public final List<StreakPetResourceStatus> streakPetResourceStatusList;

    public StreakPetResourceInfo() {
        this(null, 1, null);
    }

    public StreakPetResourceInfo(List<StreakPetResourceStatus> list) {
        this.streakPetResourceStatusList = list;
    }

    public StreakPetResourceInfo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
