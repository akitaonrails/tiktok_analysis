package com.ss.android.ugc.aweme.internalshare.api.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelOperationDelayStrategy {

    @C09CT("only_once")
    public final int onlyOnce;

    @C09CT("strategy")
    public final int strategy;

    public SharePanelOperationDelayStrategy() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharePanelOperationDelayStrategy)) {
            return false;
        }
        SharePanelOperationDelayStrategy sharePanelOperationDelayStrategy = (SharePanelOperationDelayStrategy) obj;
        return this.strategy == sharePanelOperationDelayStrategy.strategy && this.onlyOnce == sharePanelOperationDelayStrategy.onlyOnce;
    }

    public final int hashCode() {
        return (this.strategy * 31) + this.onlyOnce;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelOperationDelayStrategy(strategy=");
        sbLIZ.append(this.strategy);
        sbLIZ.append(", onlyOnce=");
        sbLIZ.append(this.onlyOnce);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SharePanelOperationDelayStrategy(int i, int i2) {
        this.strategy = i;
        this.onlyOnce = i2;
    }
}
