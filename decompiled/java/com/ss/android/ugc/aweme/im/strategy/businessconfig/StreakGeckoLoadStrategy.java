package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakGeckoLoadStrategy {

    @C09CT("streak_cold_start")
    public final List<String> coldStartLoadChannel;

    @C09CT("streak_show_lazy_load")
    public final List<String> lazyLoadChannel;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakGeckoLoadStrategy)) {
            return false;
        }
        StreakGeckoLoadStrategy streakGeckoLoadStrategy = (StreakGeckoLoadStrategy) obj;
        return Intrinsics.LJFF(this.coldStartLoadChannel, streakGeckoLoadStrategy.coldStartLoadChannel) && Intrinsics.LJFF(this.lazyLoadChannel, streakGeckoLoadStrategy.lazyLoadChannel);
    }

    public final int hashCode() {
        List<String> list = this.coldStartLoadChannel;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.lazyLoadChannel;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakGeckoLoadStrategy(coldStartLoadChannel=");
        sbLIZ.append(this.coldStartLoadChannel);
        sbLIZ.append(", lazyLoadChannel=");
        sbLIZ.append(this.lazyLoadChannel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreakGeckoLoadStrategy(List<String> list, List<String> list2) {
        this.coldStartLoadChannel = list;
        this.lazyLoadChannel = list2;
    }
}
