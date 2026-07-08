package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class SponsoredLayoutInfo implements Serializable {

    @C09CT("height")
    public final Integer height;

    @C09CT("right")
    public final Integer right;

    @C09CT("top")
    public final Integer top;

    @C09CT("width")
    public final Integer width;

    public SponsoredLayoutInfo() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredLayoutInfo)) {
            return false;
        }
        SponsoredLayoutInfo sponsoredLayoutInfo = (SponsoredLayoutInfo) obj;
        return Intrinsics.LJFF(this.height, sponsoredLayoutInfo.height) && Intrinsics.LJFF(this.width, sponsoredLayoutInfo.width) && Intrinsics.LJFF(this.top, sponsoredLayoutInfo.top) && Intrinsics.LJFF(this.right, sponsoredLayoutInfo.right);
    }

    public int hashCode() {
        Integer num = this.height;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.width;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.top;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.right;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SponsoredLayoutInfo(height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", top=");
        sbLIZ.append(this.top);
        sbLIZ.append(", right=");
        sbLIZ.append(this.right);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SponsoredLayoutInfo(Integer num, Integer num2, Integer num3, Integer num4) {
        this.height = num;
        this.width = num2;
        this.top = num3;
        this.right = num4;
    }
}
