package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExitRetentionFrequency {

    @C09CT("interval")
    public final Integer interval;

    public ExitRetentionFrequency() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExitRetentionFrequency) && Intrinsics.LJFF(this.interval, ((ExitRetentionFrequency) obj).interval);
    }

    public final int hashCode() {
        Integer num = this.interval;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitRetentionFrequency(interval=");
        sbLIZ.append(this.interval);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExitRetentionFrequency(Integer num) {
        this.interval = num;
    }
}
