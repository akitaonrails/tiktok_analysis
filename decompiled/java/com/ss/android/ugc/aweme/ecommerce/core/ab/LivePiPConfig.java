package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class LivePiPConfig {

    @C09CT("allow_list")
    public final List<String> allowList;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("load_timeout_ms")
    public final int loadTimeoutMs;

    @C09CT("should_play_after_video_ends")
    public final boolean shouldPlayAfterVideoEnds;

    public LivePiPConfig() {
        this(false, false, 0, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePiPConfig)) {
            return false;
        }
        LivePiPConfig livePiPConfig = (LivePiPConfig) obj;
        return this.enabled == livePiPConfig.enabled && this.shouldPlayAfterVideoEnds == livePiPConfig.shouldPlayAfterVideoEnds && this.loadTimeoutMs == livePiPConfig.loadTimeoutMs && Intrinsics.LJFF(this.allowList, livePiPConfig.allowList);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.enabled) * 31) + C786410Ut5.Z2(this.shouldPlayAfterVideoEnds)) * 31) + this.loadTimeoutMs) * 31) + this.allowList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePiPConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", shouldPlayAfterVideoEnds=");
        sbLIZ.append(this.shouldPlayAfterVideoEnds);
        sbLIZ.append(", loadTimeoutMs=");
        sbLIZ.append(this.loadTimeoutMs);
        sbLIZ.append(", allowList=");
        sbLIZ.append(this.allowList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LivePiPConfig(boolean z, boolean z2, int i, List<String> list) {
        this.enabled = z;
        this.shouldPlayAfterVideoEnds = z2;
        this.loadTimeoutMs = i;
        this.allowList = list;
    }

    public LivePiPConfig(boolean z, boolean z2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? 2000 : i, (i2 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
