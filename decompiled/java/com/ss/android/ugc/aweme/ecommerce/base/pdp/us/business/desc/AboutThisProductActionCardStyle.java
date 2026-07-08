package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AboutThisProductActionCardStyle {

    @C09CT("background_color")
    public final CommonColor backgroundColor;

    @C09CT("corner_radius")
    public final Float cornerRadius;

    @C09CT("height")
    public final Integer height;

    public AboutThisProductActionCardStyle() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AboutThisProductActionCardStyle)) {
            return false;
        }
        AboutThisProductActionCardStyle aboutThisProductActionCardStyle = (AboutThisProductActionCardStyle) obj;
        return Intrinsics.LJFF(this.backgroundColor, aboutThisProductActionCardStyle.backgroundColor) && Intrinsics.LJFF(this.cornerRadius, aboutThisProductActionCardStyle.cornerRadius) && Intrinsics.LJFF(this.height, aboutThisProductActionCardStyle.height);
    }

    public final int hashCode() {
        CommonColor commonColor = this.backgroundColor;
        int iHashCode = (commonColor == null ? 0 : commonColor.hashCode()) * 31;
        Float f = this.cornerRadius;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.height;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AboutThisProductActionCardStyle(backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", cornerRadius=");
        sbLIZ.append(this.cornerRadius);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AboutThisProductActionCardStyle(CommonColor commonColor, Float f, Integer num) {
        this.backgroundColor = commonColor;
        this.cornerRadius = f;
        this.height = num;
    }
}
