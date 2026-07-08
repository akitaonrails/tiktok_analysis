package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class VideoLayoutInfo implements Serializable {

    @C09CT("bottom")
    public final Integer bottom;

    @C09CT("left")
    public final Integer left;

    @C09CT("right")
    public final Integer right;

    @C09CT("top")
    public final Integer top;

    public VideoLayoutInfo() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoLayoutInfo)) {
            return false;
        }
        VideoLayoutInfo videoLayoutInfo = (VideoLayoutInfo) obj;
        return Intrinsics.LJFF(this.top, videoLayoutInfo.top) && Intrinsics.LJFF(this.right, videoLayoutInfo.right) && Intrinsics.LJFF(this.bottom, videoLayoutInfo.bottom) && Intrinsics.LJFF(this.left, videoLayoutInfo.left);
    }

    public int hashCode() {
        Integer num = this.top;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.right;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.bottom;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.left;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoLayoutInfo(top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.bottom);
        sbLIZ.append(", left=");
        sbLIZ.append(this.left);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VideoLayoutInfo(Integer num, Integer num2, Integer num3, Integer num4) {
        this.top = num;
        this.right = num2;
        this.bottom = num3;
        this.left = num4;
    }
}
