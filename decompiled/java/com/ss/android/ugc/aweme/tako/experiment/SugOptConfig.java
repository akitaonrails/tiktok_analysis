package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class SugOptConfig {
    public static final int $stable = 0;

    @C09CT("skeleton")
    public final SkeletonOptConfig skeleton;

    @C09CT("timeout_ms")
    public final long timeoutMs;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SugOptConfig)) {
            return false;
        }
        SugOptConfig sugOptConfig = (SugOptConfig) obj;
        return Intrinsics.LJFF(this.skeleton, sugOptConfig.skeleton) && this.timeoutMs == sugOptConfig.timeoutMs;
    }

    public int hashCode() {
        return (this.skeleton.hashCode() * 31) + C786410Ut5.Y2(this.timeoutMs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SugOptConfig(skeleton=");
        sbLIZ.append(this.skeleton);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.timeoutMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SugOptConfig() {
        this(new SkeletonOptConfig(false, false, 0), 0L);
    }

    public SugOptConfig(SkeletonOptConfig skeletonOptConfig, long j) {
        this.skeleton = skeletonOptConfig;
        this.timeoutMs = j;
    }
}
