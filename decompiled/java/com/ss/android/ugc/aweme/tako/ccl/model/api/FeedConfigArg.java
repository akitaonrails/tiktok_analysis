package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedConfigArg {

    @C09CT("auto_scroll")
    public final Boolean autoScroll;

    @C09CT("clear_display")
    public final Boolean clearDisplay;

    @C09CT("speed")
    public final PlaySpeed speed;

    public FeedConfigArg() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedConfigArg)) {
            return false;
        }
        FeedConfigArg feedConfigArg = (FeedConfigArg) obj;
        return this.speed == feedConfigArg.speed && Intrinsics.LJFF(this.autoScroll, feedConfigArg.autoScroll) && Intrinsics.LJFF(this.clearDisplay, feedConfigArg.clearDisplay);
    }

    public final int hashCode() {
        PlaySpeed playSpeed = this.speed;
        int iHashCode = (playSpeed == null ? 0 : playSpeed.hashCode()) * 31;
        Boolean bool = this.autoScroll;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.clearDisplay;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedConfigArg(speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", autoScroll=");
        sbLIZ.append(this.autoScroll);
        sbLIZ.append(", clearDisplay=");
        sbLIZ.append(this.clearDisplay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedConfigArg(PlaySpeed playSpeed, Boolean bool, Boolean bool2) {
        this.speed = playSpeed;
        this.autoScroll = bool;
        this.clearDisplay = bool2;
    }
}
