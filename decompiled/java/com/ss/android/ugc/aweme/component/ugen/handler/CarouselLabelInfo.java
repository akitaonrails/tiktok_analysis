package com.ss.android.ugc.aweme.component.ugen.handler;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CarouselLabelInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("product")
    public final ProductInfo product;

    @C09CT("status_info")
    public final StatusInfo statusInfo;

    @C09CT("style_info")
    public final StyleInfo styleInfo;

    public CarouselLabelInfo() {
        this(new ProductInfo("", ""), new StyleInfo(false, true, false, false, 156), new StatusInfo(true, true, null, null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselLabelInfo)) {
            return false;
        }
        CarouselLabelInfo carouselLabelInfo = (CarouselLabelInfo) obj;
        return Intrinsics.LJFF(this.product, carouselLabelInfo.product) && Intrinsics.LJFF(this.styleInfo, carouselLabelInfo.styleInfo) && Intrinsics.LJFF(this.statusInfo, carouselLabelInfo.statusInfo);
    }

    public int hashCode() {
        return (((this.product.hashCode() * 31) + this.styleInfo.hashCode()) * 31) + this.statusInfo.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselLabelInfo(product=");
        sbLIZ.append(this.product);
        sbLIZ.append(", styleInfo=");
        sbLIZ.append(this.styleInfo);
        sbLIZ.append(", statusInfo=");
        sbLIZ.append(this.statusInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CarouselLabelInfo(ProductInfo productInfo, StyleInfo styleInfo, StatusInfo statusInfo) {
        this.product = productInfo;
        this.styleInfo = styleInfo;
        this.statusInfo = statusInfo;
    }
}
