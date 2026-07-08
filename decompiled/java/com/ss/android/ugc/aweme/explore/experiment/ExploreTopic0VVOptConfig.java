package com.ss.android.ugc.aweme.explore.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes19.dex */
public final class ExploreTopic0VVOptConfig {

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("is_explore_prefetch_chunk_fix")
    public final boolean isExplorePrefetchChunkFix;

    public ExploreTopic0VVOptConfig() {
        this(false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreTopic0VVOptConfig)) {
            return false;
        }
        ExploreTopic0VVOptConfig exploreTopic0VVOptConfig = (ExploreTopic0VVOptConfig) obj;
        return this.isEnable == exploreTopic0VVOptConfig.isEnable && this.isExplorePrefetchChunkFix == exploreTopic0VVOptConfig.isExplorePrefetchChunkFix;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.isEnable) * 31) + C786410Ut5.Z2(this.isExplorePrefetchChunkFix);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreTopic0VVOptConfig(isEnable=");
        sbLIZ.append(this.isEnable);
        sbLIZ.append(", isExplorePrefetchChunkFix=");
        sbLIZ.append(this.isExplorePrefetchChunkFix);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final boolean isExplorePrefetchChunkFix() {
        return this.isExplorePrefetchChunkFix;
    }

    public ExploreTopic0VVOptConfig(boolean z, boolean z2) {
        this.isEnable = z;
        this.isExplorePrefetchChunkFix = z2;
    }
}
