package com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExitRuleData implements Serializable {

    @C09CT("exit_seconds")
    public final List<Long> exitSeconds;

    public ExitRuleData() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExitRuleData) && Intrinsics.LJFF(this.exitSeconds, ((ExitRuleData) obj).exitSeconds);
    }

    public int hashCode() {
        List<Long> list = this.exitSeconds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitRuleData(exitSeconds=");
        sbLIZ.append(this.exitSeconds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExitRuleData(List<Long> list) {
        this.exitSeconds = list;
    }
}
