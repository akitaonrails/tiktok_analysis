package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class SponsoredInfo implements Serializable {

    @C09CT("layout")
    public final SponsoredLayoutInfo sponsoredLayoutInfo;

    public SponsoredInfo() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SponsoredInfo) && Intrinsics.LJFF(this.sponsoredLayoutInfo, ((SponsoredInfo) obj).sponsoredLayoutInfo);
    }

    public int hashCode() {
        SponsoredLayoutInfo sponsoredLayoutInfo = this.sponsoredLayoutInfo;
        if (sponsoredLayoutInfo == null) {
            return 0;
        }
        return sponsoredLayoutInfo.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SponsoredInfo(sponsoredLayoutInfo=");
        sbLIZ.append(this.sponsoredLayoutInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SponsoredInfo(SponsoredLayoutInfo sponsoredLayoutInfo) {
        this.sponsoredLayoutInfo = sponsoredLayoutInfo;
    }
}
