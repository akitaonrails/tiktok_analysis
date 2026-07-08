package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetTaskData {

    @C09CT("completed")
    public final boolean completed;

    @C09CT("description")
    public final String description;

    @C09CT("reward_points")
    public final int rewardPoints;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakPetTaskData)) {
            return false;
        }
        StreakPetTaskData streakPetTaskData = (StreakPetTaskData) obj;
        return Intrinsics.LJFF(this.description, streakPetTaskData.description) && this.rewardPoints == streakPetTaskData.rewardPoints && this.completed == streakPetTaskData.completed;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPetTaskData(description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", rewardPoints=");
        sbLIZ.append(this.rewardPoints);
        sbLIZ.append(", completed=");
        sbLIZ.append(this.completed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakPetTaskData() {
        this("", 0, false);
    }

    public StreakPetTaskData(String str, int i, boolean z) {
        this.description = str;
        this.rewardPoints = i;
        this.completed = z;
    }
}
