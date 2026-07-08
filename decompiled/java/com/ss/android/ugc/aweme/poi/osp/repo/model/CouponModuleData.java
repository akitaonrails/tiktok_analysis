package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import X.C1201190hMb;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class CouponModuleData extends BaseComponentData implements Serializable {

    @C09CT("compliance_theme")
    public final Integer complianceTheme;

    @C09CT("coupon_list")
    public final List<Object> couponList;

    @C09CT("coupon_track_info")
    public final String couponTrackInfo;

    @C09CT("discount_amount")
    public final DiscountAmount discountAmount;

    @C09CT("marketing_identifier_str")
    public final String marketingIdentifierStr;

    @C09CT("promotion_keys")
    public final List<String> promotionKeys;

    @C09CT("cta")
    public final String title;

    @C09CT("max_discount_tag")
    public final String titleTag;

    public final CouponModuleData copy(String str, DiscountAmount discountAmount, List<? extends Object> list, String str2, String str3, List<String> list2, String str4, Integer num) {
        return new CouponModuleData(str, discountAmount, list, str2, str3, list2, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponModuleData)) {
            return false;
        }
        CouponModuleData couponModuleData = (CouponModuleData) obj;
        return Intrinsics.LJFF(this.title, couponModuleData.title) && Intrinsics.LJFF(this.discountAmount, couponModuleData.discountAmount) && Intrinsics.LJFF(this.couponList, couponModuleData.couponList) && Intrinsics.LJFF(this.marketingIdentifierStr, couponModuleData.marketingIdentifierStr) && Intrinsics.LJFF(this.couponTrackInfo, couponModuleData.couponTrackInfo) && Intrinsics.LJFF(this.promotionKeys, couponModuleData.promotionKeys) && Intrinsics.LJFF(this.titleTag, couponModuleData.titleTag) && Intrinsics.LJFF(this.complianceTheme, couponModuleData.complianceTheme);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DiscountAmount discountAmount = this.discountAmount;
        int iHashCode2 = (iHashCode + (discountAmount == null ? 0 : discountAmount.hashCode())) * 31;
        List<Object> list = this.couponList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.marketingIdentifierStr;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.couponTrackInfo;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list2 = this.promotionKeys;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.titleTag;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.complianceTheme;
        return iHashCode7 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CouponModuleData(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", discountAmount=");
        sbLIZ.append(this.discountAmount);
        sbLIZ.append(", couponList=");
        sbLIZ.append(this.couponList);
        sbLIZ.append(", marketingIdentifierStr=");
        sbLIZ.append(this.marketingIdentifierStr);
        sbLIZ.append(", couponTrackInfo=");
        sbLIZ.append(this.couponTrackInfo);
        sbLIZ.append(", promotionKeys=");
        sbLIZ.append(this.promotionKeys);
        sbLIZ.append(", titleTag=");
        sbLIZ.append(this.titleTag);
        sbLIZ.append(", complianceTheme=");
        sbLIZ.append(this.complianceTheme);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getComplianceTheme() {
        return this.complianceTheme;
    }

    public final List<Object> getCouponList() {
        return this.couponList;
    }

    public final String getCouponTrackInfo() {
        return this.couponTrackInfo;
    }

    public final DiscountAmount getDiscountAmount() {
        return this.discountAmount;
    }

    public final String getMarketingIdentifierStr() {
        return this.marketingIdentifierStr;
    }

    public final List<String> getPromotionKeys() {
        return this.promotionKeys;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleTag() {
        return this.titleTag;
    }

    public CouponModuleData(String str, DiscountAmount discountAmount, List<? extends Object> list, String str2, String str3, List<String> list2, String str4, Integer num) {
        this.title = str;
        this.discountAmount = discountAmount;
        this.couponList = list;
        this.marketingIdentifierStr = str2;
        this.couponTrackInfo = str3;
        this.promotionKeys = list2;
        this.titleTag = str4;
        this.complianceTheme = num;
    }
}
