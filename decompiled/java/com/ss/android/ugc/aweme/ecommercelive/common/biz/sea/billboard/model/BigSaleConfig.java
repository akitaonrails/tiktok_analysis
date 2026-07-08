package com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BigSaleConfig {

    @C09CT("height")
    public final Integer imageHeight;

    @C09CT("image_id")
    public final String imageId;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("width")
    public final Integer imageWidth;

    public BigSaleConfig() {
        this(null, null, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BigSaleConfig)) {
            return false;
        }
        BigSaleConfig bigSaleConfig = (BigSaleConfig) obj;
        return Intrinsics.LJFF(this.imageUrl, bigSaleConfig.imageUrl) && Intrinsics.LJFF(this.imageId, bigSaleConfig.imageId) && Intrinsics.LJFF(this.imageWidth, bigSaleConfig.imageWidth) && Intrinsics.LJFF(this.imageHeight, bigSaleConfig.imageHeight);
    }

    public final int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.imageWidth;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.imageHeight;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BigSaleConfig(imageUrl=");
        sbLIZ.append(this.imageUrl);
        sbLIZ.append(", imageId=");
        sbLIZ.append(this.imageId);
        sbLIZ.append(", imageWidth=");
        sbLIZ.append(this.imageWidth);
        sbLIZ.append(", imageHeight=");
        sbLIZ.append(this.imageHeight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BigSaleConfig(String str, String str2, Integer num, Integer num2) {
        this.imageUrl = str;
        this.imageId = str2;
        this.imageWidth = num;
        this.imageHeight = num2;
    }
}
