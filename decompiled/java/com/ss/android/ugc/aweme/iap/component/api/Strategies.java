package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Strategies {

    @C09CT("count_down")
    public final CountDownData countDown;

    @C09CT("exit_retention")
    public final ExitRetentionData exitRetention;

    public Strategies() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategies)) {
            return false;
        }
        Strategies strategies = (Strategies) obj;
        return Intrinsics.LJFF(this.exitRetention, strategies.exitRetention) && Intrinsics.LJFF(this.countDown, strategies.countDown);
    }

    public final int hashCode() {
        ExitRetentionData exitRetentionData = this.exitRetention;
        int iHashCode = (exitRetentionData == null ? 0 : exitRetentionData.hashCode()) * 31;
        CountDownData countDownData = this.countDown;
        return iHashCode + (countDownData != null ? countDownData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Strategies(exitRetention=");
        sbLIZ.append(this.exitRetention);
        sbLIZ.append(", countDown=");
        sbLIZ.append(this.countDown);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Strategies(ExitRetentionData exitRetentionData, CountDownData countDownData) {
        this.exitRetention = exitRetentionData;
        this.countDown = countDownData;
    }
}
