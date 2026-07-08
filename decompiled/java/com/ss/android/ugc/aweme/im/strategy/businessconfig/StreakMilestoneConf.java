package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C1604406Py;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakMilestoneConf extends IBusinessConfig {
    public static final C1604406Py Companion = new Object() { // from class: X.06Py
    };

    @C09CT("gecko_load_strategy")
    public final StreakGeckoLoadStrategy geckoLoadStrategy;

    @C09CT("level_data")
    public final List<StreakLevelData> levelDataList;

    public final StreakMilestoneConf copy(List<StreakLevelData> list, StreakGeckoLoadStrategy streakGeckoLoadStrategy) {
        return new StreakMilestoneConf(list, streakGeckoLoadStrategy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakMilestoneConf)) {
            return false;
        }
        StreakMilestoneConf streakMilestoneConf = (StreakMilestoneConf) obj;
        return Intrinsics.LJFF(this.levelDataList, streakMilestoneConf.levelDataList) && Intrinsics.LJFF(this.geckoLoadStrategy, streakMilestoneConf.geckoLoadStrategy);
    }

    public int hashCode() {
        List<StreakLevelData> list = this.levelDataList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        StreakGeckoLoadStrategy streakGeckoLoadStrategy = this.geckoLoadStrategy;
        return iHashCode + (streakGeckoLoadStrategy != null ? streakGeckoLoadStrategy.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakMilestoneConf(levelDataList=");
        sbLIZ.append(this.levelDataList);
        sbLIZ.append(", geckoLoadStrategy=");
        sbLIZ.append(this.geckoLoadStrategy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isValid() {
        /*
            r6 = this;
            java.util.List<com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelData> r0 = r6.levelDataList
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L63
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L63
            java.util.List<com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelData> r0 = r6.levelDataList
            java.util.Iterator r4 = r0.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r3 = r4.next()
            r1 = r3
            com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelData r1 = (com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelData) r1
            if (r1 == 0) goto L42
            java.lang.Integer r0 = r1.level
            if (r0 == 0) goto L42
            int r0 = r0.intValue()
            if (r0 <= 0) goto L42
            com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelResConfig r0 = r1.normalResource
            if (r0 == 0) goto L42
            boolean r0 = r0.LIZ()
            if (r0 != r2) goto L42
            com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelResConfig r0 = r1.darkResource
            if (r0 == 0) goto L42
            boolean r0 = r0.LIZ()
            if (r0 != r2) goto L42
            goto L14
        L42:
            if (r3 != 0) goto L55
        L44:
            com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakGeckoLoadStrategy r1 = r6.geckoLoadStrategy
            if (r1 == 0) goto L55
            java.util.List<java.lang.String> r0 = r1.coldStartLoadChannel
            if (r0 == 0) goto L56
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L56
        L54:
            r5 = 1
        L55:
            return r5
        L56:
            java.util.List<java.lang.String> r0 = r1.lazyLoadChannel
            if (r0 == 0) goto L55
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L55
            goto L54
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf.isValid():boolean");
    }

    public final StreakGeckoLoadStrategy getGeckoLoadStrategy() {
        return this.geckoLoadStrategy;
    }

    public final List<StreakLevelData> getLevelDataList() {
        return this.levelDataList;
    }

    public StreakMilestoneConf(List<StreakLevelData> list, StreakGeckoLoadStrategy streakGeckoLoadStrategy) {
        this.levelDataList = list;
        this.geckoLoadStrategy = streakGeckoLoadStrategy;
    }
}
