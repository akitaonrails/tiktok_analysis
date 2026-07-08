package com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AIProductImage implements Serializable {
    public static final int $stable = 0;

    @C09CT("height")
    public final Integer height;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("width")
    public final Integer width;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIProductImage)) {
            return false;
        }
        AIProductImage aIProductImage = (AIProductImage) obj;
        return Intrinsics.LJFF(this.imageUrl, aIProductImage.imageUrl) && Intrinsics.LJFF(this.width, aIProductImage.width) && Intrinsics.LJFF(this.height, aIProductImage.height);
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIProductImage(imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIProductImage(String str, Integer num, Integer num2) {
        this.imageUrl = str;
        this.width = num;
        this.height = num2;
    }
}
