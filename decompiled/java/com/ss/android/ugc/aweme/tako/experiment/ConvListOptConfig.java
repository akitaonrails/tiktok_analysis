package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ConvListOptConfig {
    public static final int $stable = 0;

    @C09CT("refresh_loading")
    public final RefreshLoadingConfig refreshLoading;

    @C09CT("skeleton")
    public final SkeletonOptConfig skeleton;

    @C09CT("timeout_ms")
    public final long timeoutMs;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvListOptConfig)) {
            return false;
        }
        ConvListOptConfig convListOptConfig = (ConvListOptConfig) obj;
        return Intrinsics.LJFF(this.skeleton, convListOptConfig.skeleton) && Intrinsics.LJFF(this.refreshLoading, convListOptConfig.refreshLoading) && this.timeoutMs == convListOptConfig.timeoutMs;
    }

    public int hashCode() {
        return (((this.skeleton.hashCode() * 31) + this.refreshLoading.hashCode()) * 31) + C786410Ut5.Y2(this.timeoutMs);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConvListOptConfig(skeleton=");
        sbLIZ.append(this.skeleton);
        sbLIZ.append(", refreshLoading=");
        sbLIZ.append(this.refreshLoading);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.timeoutMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ConvListOptConfig() {
        this(new SkeletonOptConfig(false, false, 0), new RefreshLoadingConfig(false, 0L), 0L);
    }

    public ConvListOptConfig(SkeletonOptConfig skeletonOptConfig, RefreshLoadingConfig refreshLoadingConfig, long j) {
        this.skeleton = skeletonOptConfig;
        this.refreshLoading = refreshLoadingConfig;
        this.timeoutMs = j;
    }
}
