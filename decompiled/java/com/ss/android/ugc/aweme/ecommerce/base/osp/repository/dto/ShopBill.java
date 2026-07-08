package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShopBill {

    @C09CT("discount")
    public Price discount;

    @C09CT("product_total")
    public String productTotal;

    @C09CT("sales_tax")
    public BillItem salesTax;

    @C09CT("total")
    public Price total;

    @C09CT("total_discount")
    public String totalDiscount;

    public ShopBill() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopBill)) {
            return false;
        }
        ShopBill shopBill = (ShopBill) obj;
        return Intrinsics.LJFF(this.productTotal, shopBill.productTotal) && Intrinsics.LJFF(this.total, shopBill.total) && Intrinsics.LJFF(this.totalDiscount, shopBill.totalDiscount) && Intrinsics.LJFF(this.discount, shopBill.discount) && Intrinsics.LJFF(this.salesTax, shopBill.salesTax);
    }

    public final int hashCode() {
        String str = this.productTotal;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Price price = this.total;
        int iHashCode2 = (iHashCode + (price == null ? 0 : price.hashCode())) * 31;
        String str2 = this.totalDiscount;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Price price2 = this.discount;
        int iHashCode4 = (iHashCode3 + (price2 == null ? 0 : price2.hashCode())) * 31;
        BillItem billItem = this.salesTax;
        return iHashCode4 + (billItem != null ? billItem.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopBill(productTotal=");
        sbLIZ.append(this.productTotal);
        sbLIZ.append(", total=");
        sbLIZ.append(this.total);
        sbLIZ.append(", totalDiscount=");
        sbLIZ.append(this.totalDiscount);
        sbLIZ.append(", discount=");
        sbLIZ.append(this.discount);
        sbLIZ.append(", salesTax=");
        sbLIZ.append(this.salesTax);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShopBill(String str, Price price, String str2, Price price2, BillItem billItem) {
        this.productTotal = str;
        this.total = price;
        this.totalDiscount = str2;
        this.discount = price2;
        this.salesTax = billItem;
    }
}
