package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoModeFullBitmapModel {

    @C09CT("max")
    public final long max;

    @C09CT("score")
    public final float score;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public final int f65switch;

    public PhotoModeFullBitmapModel() {
        this(0, 104857600L, -1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoModeFullBitmapModel)) {
            return false;
        }
        PhotoModeFullBitmapModel photoModeFullBitmapModel = (PhotoModeFullBitmapModel) obj;
        return this.f65switch == photoModeFullBitmapModel.f65switch && this.max == photoModeFullBitmapModel.max && Float.compare(this.score, photoModeFullBitmapModel.score) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeFullBitmapModel(switch=");
        sbLIZ.append(this.f65switch);
        sbLIZ.append(", max=");
        sbLIZ.append(this.max);
        sbLIZ.append(", score=");
        sbLIZ.append(this.score);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((this.f65switch * 31) + C786410Ut5.Y2(this.max)) * 31) + Float.floatToIntBits(this.score);
    }

    public PhotoModeFullBitmapModel(int i, long j, float f) {
        this.f65switch = i;
        this.max = j;
        this.score = f;
    }
}
