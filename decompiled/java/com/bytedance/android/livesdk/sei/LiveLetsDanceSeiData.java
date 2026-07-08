package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LiveLetsDanceSeiData {

    @C09CT("game_progress")
    public Integer gameProgress;

    @C09CT("start_play_offset_ms")
    public Integer startPlayOffsetMs;

    public LiveLetsDanceSeiData() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveLetsDanceSeiData)) {
            return false;
        }
        LiveLetsDanceSeiData liveLetsDanceSeiData = (LiveLetsDanceSeiData) obj;
        return Intrinsics.LJFF(this.gameProgress, liveLetsDanceSeiData.gameProgress) && Intrinsics.LJFF(this.startPlayOffsetMs, liveLetsDanceSeiData.startPlayOffsetMs);
    }

    public final int hashCode() {
        Integer num = this.gameProgress;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.startPlayOffsetMs;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveLetsDanceSeiData(gameProgress=");
        sbLIZ.append(this.gameProgress);
        sbLIZ.append(", startPlayOffsetMs=");
        sbLIZ.append(this.startPlayOffsetMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LiveLetsDanceSeiData(Integer num, Integer num2) {
        this.gameProgress = num;
        this.startPlayOffsetMs = num2;
    }
}
