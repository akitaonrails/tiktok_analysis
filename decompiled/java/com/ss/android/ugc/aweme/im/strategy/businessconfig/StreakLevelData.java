package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakLevelData {

    @C09CT("dark")
    public final StreakLevelResConfig darkResource;

    @C09CT("level")
    public final Integer level;

    @C09CT("normal")
    public final StreakLevelResConfig normalResource;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakLevelData)) {
            return false;
        }
        StreakLevelData streakLevelData = (StreakLevelData) obj;
        return Intrinsics.LJFF(this.level, streakLevelData.level) && Intrinsics.LJFF(this.normalResource, streakLevelData.normalResource) && Intrinsics.LJFF(this.darkResource, streakLevelData.darkResource);
    }

    public final int hashCode() {
        Integer num = this.level;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        StreakLevelResConfig streakLevelResConfig = this.normalResource;
        int iHashCode2 = (iHashCode + (streakLevelResConfig == null ? 0 : streakLevelResConfig.hashCode())) * 31;
        StreakLevelResConfig streakLevelResConfig2 = this.darkResource;
        return iHashCode2 + (streakLevelResConfig2 != null ? streakLevelResConfig2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakLevelData(level=");
        sbLIZ.append(this.level);
        sbLIZ.append(", normalResource=");
        sbLIZ.append(this.normalResource);
        sbLIZ.append(", darkResource=");
        sbLIZ.append(this.darkResource);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakLevelData(Integer num, StreakLevelResConfig streakLevelResConfig, StreakLevelResConfig streakLevelResConfig2) {
        this.level = num;
        this.normalResource = streakLevelResConfig;
        this.darkResource = streakLevelResConfig2;
    }
}
