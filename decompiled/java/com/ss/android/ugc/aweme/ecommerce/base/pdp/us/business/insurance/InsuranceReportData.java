package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.insurance;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class InsuranceReportData {

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("entrance_info")
    public final String entranceInfo;

    @C09CT("is_single_sku")
    public final Integer isSingleSku;

    @C09CT("original_price")
    public final String originalPrice;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_type")
    public final Integer productType;

    @C09CT("sale_price")
    public final String salePrice;

    @C09CT("sku_id")
    public final String skuId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsuranceReportData)) {
            return false;
        }
        InsuranceReportData insuranceReportData = (InsuranceReportData) obj;
        return Intrinsics.LJFF(this.enterFrom, insuranceReportData.enterFrom) && Intrinsics.LJFF(this.productId, insuranceReportData.productId) && Intrinsics.LJFF(this.productType, insuranceReportData.productType) && Intrinsics.LJFF(this.entranceInfo, insuranceReportData.entranceInfo) && Intrinsics.LJFF(this.skuId, insuranceReportData.skuId) && Intrinsics.LJFF(this.originalPrice, insuranceReportData.originalPrice) && Intrinsics.LJFF(this.salePrice, insuranceReportData.salePrice) && Intrinsics.LJFF(this.isSingleSku, insuranceReportData.isSingleSku);
    }

    public final int hashCode() {
        String str = this.enterFrom;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.productType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.entranceInfo;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.skuId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.originalPrice;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.salePrice;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.isSingleSku;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsuranceReportData(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.productId);
        sbLIZ.append(", productType=");
        sbLIZ.append(this.productType);
        sbLIZ.append(", entranceInfo=");
        sbLIZ.append(this.entranceInfo);
        sbLIZ.append(", skuId=");
        sbLIZ.append(this.skuId);
        sbLIZ.append(", originalPrice=");
        sbLIZ.append(this.originalPrice);
        sbLIZ.append(", salePrice=");
        sbLIZ.append(this.salePrice);
        sbLIZ.append(", isSingleSku=");
        sbLIZ.append(this.isSingleSku);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InsuranceReportData(String str, String str2, Integer num, String str3, String str4, String str5, String str6, Integer num2) {
        this.enterFrom = str;
        this.productId = str2;
        this.productType = num;
        this.entranceInfo = str3;
        this.skuId = str4;
        this.originalPrice = str5;
        this.salePrice = str6;
        this.isSingleSku = num2;
    }
}
