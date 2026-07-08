package com.ss.android.ugc.aweme.shortvideo.stitch;

import X.C004I;
import X.C2188811AlT;
import X.C529150Kp7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class StitchState implements C004I {
    public static final int $stable = 8;
    public final C529150Kp7 hideIntroduceEvent;
    public final C529150Kp7 quitEvent;
    public final C529150Kp7 showIntroduceEvent;
    public final C529150Kp7 showTrimmingNextGuideEvent;
    public final C529150Kp7 showTrimmingViewGuideEvent;

    public StitchState() {
        this(null, null, null, null, null);
    }

    public final StitchState copy(C529150Kp7 c529150Kp7, C529150Kp7 c529150Kp72, C529150Kp7 c529150Kp73, C529150Kp7 c529150Kp74, C529150Kp7 c529150Kp75) {
        return new StitchState(c529150Kp7, c529150Kp72, c529150Kp73, c529150Kp74, c529150Kp75);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchState)) {
            return false;
        }
        StitchState stitchState = (StitchState) obj;
        return Intrinsics.LJFF(this.showIntroduceEvent, stitchState.showIntroduceEvent) && Intrinsics.LJFF(this.hideIntroduceEvent, stitchState.hideIntroduceEvent) && Intrinsics.LJFF(this.showTrimmingViewGuideEvent, stitchState.showTrimmingViewGuideEvent) && Intrinsics.LJFF(this.showTrimmingNextGuideEvent, stitchState.showTrimmingNextGuideEvent) && Intrinsics.LJFF(this.quitEvent, stitchState.quitEvent);
    }

    public int hashCode() {
        C529150Kp7 c529150Kp7 = this.showIntroduceEvent;
        int iHashCode = (c529150Kp7 == null ? 0 : c529150Kp7.hashCode()) * 31;
        C529150Kp7 c529150Kp72 = this.hideIntroduceEvent;
        int iHashCode2 = (iHashCode + (c529150Kp72 == null ? 0 : c529150Kp72.hashCode())) * 31;
        C529150Kp7 c529150Kp73 = this.showTrimmingViewGuideEvent;
        int iHashCode3 = (iHashCode2 + (c529150Kp73 == null ? 0 : c529150Kp73.hashCode())) * 31;
        C529150Kp7 c529150Kp74 = this.showTrimmingNextGuideEvent;
        int iHashCode4 = (iHashCode3 + (c529150Kp74 == null ? 0 : c529150Kp74.hashCode())) * 31;
        C529150Kp7 c529150Kp75 = this.quitEvent;
        return iHashCode4 + (c529150Kp75 != null ? c529150Kp75.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StitchState(showIntroduceEvent=");
        sbLIZ.append(this.showIntroduceEvent);
        sbLIZ.append(", hideIntroduceEvent=");
        sbLIZ.append(this.hideIntroduceEvent);
        sbLIZ.append(", showTrimmingViewGuideEvent=");
        sbLIZ.append(this.showTrimmingViewGuideEvent);
        sbLIZ.append(", showTrimmingNextGuideEvent=");
        sbLIZ.append(this.showTrimmingNextGuideEvent);
        sbLIZ.append(", quitEvent=");
        sbLIZ.append(this.quitEvent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C529150Kp7 getHideIntroduceEvent() {
        return this.hideIntroduceEvent;
    }

    public final C529150Kp7 getQuitEvent() {
        return this.quitEvent;
    }

    public final C529150Kp7 getShowIntroduceEvent() {
        return this.showIntroduceEvent;
    }

    public final C529150Kp7 getShowTrimmingNextGuideEvent() {
        return this.showTrimmingNextGuideEvent;
    }

    public final C529150Kp7 getShowTrimmingViewGuideEvent() {
        return this.showTrimmingViewGuideEvent;
    }

    public StitchState(C529150Kp7 c529150Kp7, C529150Kp7 c529150Kp72, C529150Kp7 c529150Kp73, C529150Kp7 c529150Kp74, C529150Kp7 c529150Kp75) {
        this.showIntroduceEvent = c529150Kp7;
        this.hideIntroduceEvent = c529150Kp72;
        this.showTrimmingViewGuideEvent = c529150Kp73;
        this.showTrimmingNextGuideEvent = c529150Kp74;
        this.quitEvent = c529150Kp75;
    }
}
