package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UcpContentItem {

    @C09CT("brand")
    public final String brand;

    @C09CT("content_id")
    public final String contentId;

    @C09CT("content_name")
    public final String contentName;

    @C09CT("price")
    public final String price;

    @C09CT("quantity")
    public final Integer quantity;

    public UcpContentItem() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UcpContentItem)) {
            return false;
        }
        UcpContentItem ucpContentItem = (UcpContentItem) obj;
        return Intrinsics.LJFF(this.price, ucpContentItem.price) && Intrinsics.LJFF(this.quantity, ucpContentItem.quantity) && Intrinsics.LJFF(this.contentId, ucpContentItem.contentId) && Intrinsics.LJFF(this.contentName, ucpContentItem.contentName) && Intrinsics.LJFF(this.brand, ucpContentItem.brand);
    }

    public final int hashCode() {
        String str = this.price;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.quantity;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.contentId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.brand;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UcpContentItem(price=");
        sbLIZ.append(this.price);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.quantity);
        sbLIZ.append(", contentId=");
        sbLIZ.append(this.contentId);
        sbLIZ.append(", contentName=");
        sbLIZ.append(this.contentName);
        sbLIZ.append(", brand=");
        sbLIZ.append(this.brand);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UcpContentItem(String str, Integer num, String str2, String str3, String str4) {
        this.price = str;
        this.quantity = num;
        this.contentId = str2;
        this.contentName = str3;
        this.brand = str4;
    }
}
