package com.bytedance.applog.priority.original;

import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class PragmaConfig {
    public final int checkpointLimit;
    public final boolean closeSynchronous;
    public final boolean connectLimitAll;
    public final boolean connectLimitLow;
    public final long mmapSize;

    public PragmaConfig() {
        this(false, false, false, 0L, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PragmaConfig)) {
            return false;
        }
        PragmaConfig pragmaConfig = (PragmaConfig) obj;
        return this.connectLimitAll == pragmaConfig.connectLimitAll && this.connectLimitLow == pragmaConfig.connectLimitLow && this.closeSynchronous == pragmaConfig.closeSynchronous && this.mmapSize == pragmaConfig.mmapSize && this.checkpointLimit == pragmaConfig.checkpointLimit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.connectLimitAll;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.connectLimitLow;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        return ((((((i + r02) * 31) + (this.closeSynchronous ? 1 : 0)) * 31) + C786410Ut5.Y2(this.mmapSize)) * 31) + this.checkpointLimit;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PragmaConfig(connectLimitAll=");
        sbLIZ.append(this.connectLimitAll);
        sbLIZ.append(", connectLimitLow=");
        sbLIZ.append(this.connectLimitLow);
        sbLIZ.append(", closeSynchronous=");
        sbLIZ.append(this.closeSynchronous);
        sbLIZ.append(", mmapSize=");
        sbLIZ.append(this.mmapSize);
        sbLIZ.append(", checkpointLimit=");
        sbLIZ.append(this.checkpointLimit);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PragmaConfig(boolean z, boolean z2, boolean z3, long j, int i) {
        this.connectLimitAll = z;
        this.connectLimitLow = z2;
        this.closeSynchronous = z3;
        this.mmapSize = j;
        this.checkpointLimit = i;
    }
}
