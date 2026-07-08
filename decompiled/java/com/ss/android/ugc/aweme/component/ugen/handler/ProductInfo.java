package com.ss.android.ugc.aweme.component.ugen.handler;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class ProductInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("anchor_title")
    public String anchorTitle;

    @C09CT("discount")
    public String discount;

    public final ProductInfo copy(String str, String str2) {
        return new ProductInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductInfo)) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) obj;
        return Intrinsics.LJFF(this.anchorTitle, productInfo.anchorTitle) && Intrinsics.LJFF(this.discount, productInfo.discount);
    }

    public int hashCode() {
        return (this.anchorTitle.hashCode() * 31) + this.discount.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductInfo(anchorTitle=");
        sbLIZ.append(this.anchorTitle);
        sbLIZ.append(", discount=");
        sbLIZ.append(this.discount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductInfo() {
        this("", "");
    }

    public final void setAnchorTitle(String str) {
        this.anchorTitle = str;
    }

    public final void setDiscount(String str) {
        this.discount = str;
    }

    public ProductInfo(String str, String str2) {
        this.anchorTitle = str;
        this.discount = str2;
    }
}
