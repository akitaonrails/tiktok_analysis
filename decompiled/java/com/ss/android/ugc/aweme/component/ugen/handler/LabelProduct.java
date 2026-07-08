package com.ss.android.ugc.aweme.component.ugen.handler;

import X.C09CT;
import X.C786410Ut5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class LabelProduct {

    @C09CT("anchor_title")
    public String anchorTitle;

    @C09CT("disable_label")
    public boolean disableLabel;

    @C09CT("discount_info")
    public final double discountInfo;

    @C09CT("native_site_custom_data")
    public final String nativeSiteCustomData;

    @C09CT("open_url")
    public final String openUrl;

    @C09CT("product_id")
    public final String productId;

    @C09CT("promo_event_tag")
    public String promoEventTag;

    @C09CT("sells_point_list")
    public List<? extends Map<String, ? extends Object>> sellsPointList;

    @C09CT("should_web_url_jump_third_app")
    public final int shouldWebUrlJumpThirdApp;

    @C09CT("spu_id")
    public final String spuId;

    @C09CT("web_url")
    public final String webUrl;

    public LabelProduct() {
        this("", "", "", "", "", 0, false, 0.0d, null, "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelProduct)) {
            return false;
        }
        LabelProduct labelProduct = (LabelProduct) obj;
        return Intrinsics.LJFF(this.productId, labelProduct.productId) && Intrinsics.LJFF(this.webUrl, labelProduct.webUrl) && Intrinsics.LJFF(this.openUrl, labelProduct.openUrl) && Intrinsics.LJFF(this.anchorTitle, labelProduct.anchorTitle) && Intrinsics.LJFF(this.nativeSiteCustomData, labelProduct.nativeSiteCustomData) && this.shouldWebUrlJumpThirdApp == labelProduct.shouldWebUrlJumpThirdApp && this.disableLabel == labelProduct.disableLabel && Double.compare(this.discountInfo, labelProduct.discountInfo) == 0 && Intrinsics.LJFF(this.sellsPointList, labelProduct.sellsPointList) && Intrinsics.LJFF(this.promoEventTag, labelProduct.promoEventTag) && Intrinsics.LJFF(this.spuId, labelProduct.spuId);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.productId.hashCode() * 31) + this.webUrl.hashCode()) * 31) + this.openUrl.hashCode()) * 31) + this.anchorTitle.hashCode()) * 31) + this.nativeSiteCustomData.hashCode()) * 31) + this.shouldWebUrlJumpThirdApp) * 31) + C786410Ut5.Z2(this.disableLabel)) * 31) + C786410Ut5.X2(this.discountInfo)) * 31;
        List<? extends Map<String, ? extends Object>> list = this.sellsPointList;
        return ((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.promoEventTag.hashCode()) * 31) + this.spuId.hashCode();
    }

    public final String toString() {
        return "LabelProduct(productId=" + this.productId + ", webUrl=" + this.webUrl + ", openUrl=" + this.openUrl + ", anchorTitle=" + this.anchorTitle + ", nativeSiteCustomData=" + this.nativeSiteCustomData + ", shouldWebUrlJumpThirdApp=" + this.shouldWebUrlJumpThirdApp + ", disableLabel=" + this.disableLabel + ", discountInfo=" + this.discountInfo + ", sellsPointList=" + this.sellsPointList + ", promoEventTag=" + this.promoEventTag + ", spuId=" + this.spuId + ')';
    }

    public LabelProduct(String str, String str2, String str3, String str4, String str5, int i, boolean z, double d, List<? extends Map<String, ? extends Object>> list, String str6, String str7) {
        this.productId = str;
        this.webUrl = str2;
        this.openUrl = str3;
        this.anchorTitle = str4;
        this.nativeSiteCustomData = str5;
        this.shouldWebUrlJumpThirdApp = i;
        this.disableLabel = z;
        this.discountInfo = d;
        this.sellsPointList = list;
        this.promoEventTag = str6;
        this.spuId = str7;
    }
}
