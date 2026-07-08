package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import X.C13LP;
import X.C1617230sBd;
import X.C1697810uHb;
import X.C2188811AlT;
import com.bytedance.android.livesdk.iap.IapSubscriptionOfferPricing;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetail;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public class SubscriptionProductDetailWithTemplateInfo implements Serializable {

    @C09CT("product_detail")
    public SubscriptionProductDetail subscriptionProductDetail;

    @C09CT("template_info")
    public TemplateInfo templateInfo;

    public SubscriptionProductDetailWithTemplateInfo() {
        this(null, null);
    }

    public String toString() {
        List<SubscriptionProductDetail.PricePhase> list;
        SubscriptionProductDetail.PricePhase pricePhase;
        List<SubscriptionProductDetail.PricePhase> list2;
        SubscriptionProductDetail.PricePhase pricePhase2;
        List<SubscriptionProductDetail.PricePhase> list3;
        OfferInfo offerInfo;
        OfferInfo offerInfo2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateInfo: iap_id=");
        TemplateInfo templateInfo = this.templateInfo;
        String str = null;
        sbLIZ.append(templateInfo != null ? templateInfo.iapId : null);
        sbLIZ.append(", tpl_type=");
        TemplateInfo templateInfo2 = this.templateInfo;
        sbLIZ.append(templateInfo2 != null ? Integer.valueOf(templateInfo2.tplType) : null);
        sbLIZ.append("base_plan_id=");
        TemplateInfo templateInfo3 = this.templateInfo;
        sbLIZ.append(templateInfo3 != null ? templateInfo3.basePlanId : null);
        sbLIZ.append(", offer_id=");
        TemplateInfo templateInfo4 = this.templateInfo;
        sbLIZ.append((templateInfo4 == null || (offerInfo2 = templateInfo4.offerInfo) == null) ? null : offerInfo2.id);
        sbLIZ.append(", price=");
        TemplateInfo templateInfo5 = this.templateInfo;
        sbLIZ.append(templateInfo5 != null ? templateInfo5.moneyDisplay : null);
        sbLIZ.append(", offer_price=");
        TemplateInfo templateInfo6 = this.templateInfo;
        sbLIZ.append((templateInfo6 == null || (offerInfo = templateInfo6.offerInfo) == null) ? null : offerInfo.discountMoneyDisplay);
        sbLIZ.append(" \nProductDetail: skuname=");
        SubscriptionProductDetail subscriptionProductDetail = this.subscriptionProductDetail;
        sbLIZ.append(subscriptionProductDetail != null ? subscriptionProductDetail.skuName : null);
        sbLIZ.append(", price_size=");
        SubscriptionProductDetail subscriptionProductDetail2 = this.subscriptionProductDetail;
        sbLIZ.append((subscriptionProductDetail2 == null || (list3 = subscriptionProductDetail2.pricePhaseList) == null) ? null : Integer.valueOf(list3.size()));
        sbLIZ.append(" original_price=");
        SubscriptionProductDetail subscriptionProductDetail3 = this.subscriptionProductDetail;
        sbLIZ.append((subscriptionProductDetail3 == null || (list2 = subscriptionProductDetail3.pricePhaseList) == null || (pricePhase2 = (SubscriptionProductDetail.PricePhase) C13LP.LJJLIIIJL(list2)) == null) ? null : pricePhase2.price);
        sbLIZ.append(", offer_price=");
        SubscriptionProductDetail subscriptionProductDetail4 = this.subscriptionProductDetail;
        if (subscriptionProductDetail4 != null && (list = subscriptionProductDetail4.pricePhaseList) != null && (pricePhase = (SubscriptionProductDetail.PricePhase) C13LP.LJJJLL(list)) != null) {
            str = pricePhase.price;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final SubscriptionProductDetail getSubscriptionProductDetail() {
        return this.subscriptionProductDetail;
    }

    public final TemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    public final void setAutoDeductionDetail(IapSubscriptionProduct iapSubscriptionProduct) {
        String str;
        String str2;
        List<IapSubscriptionOfferPricing> list;
        ArrayList arrayList = new ArrayList();
        if (iapSubscriptionProduct != null && (list = iapSubscriptionProduct.pricingPhases) != null) {
            for (IapSubscriptionOfferPricing iapSubscriptionOfferPricing : list) {
                arrayList.add(new SubscriptionProductDetail.PricePhase(iapSubscriptionOfferPricing.priceCurrencyCode, iapSubscriptionOfferPricing.price, Long.valueOf(iapSubscriptionOfferPricing.priceAmountMicros)));
            }
        }
        TemplateInfo templateInfo = this.templateInfo;
        String str3 = null;
        if (templateInfo != null) {
            str = templateInfo.iapId;
        } else {
            str = null;
        }
        if (iapSubscriptionProduct != null) {
            str2 = iapSubscriptionProduct.offerId;
            str3 = iapSubscriptionProduct.offerToken;
        } else {
            str2 = null;
        }
        this.subscriptionProductDetail = new SubscriptionProductDetail(str, str2, str3, arrayList);
    }

    public final void setOneTimeProductDetail(C1617230sBd c1617230sBd) {
        String str;
        String str2;
        Long lValueOf;
        SubscriptionProductDetail.PricePhase[] pricePhaseArr = new SubscriptionProductDetail.PricePhase[1];
        String str3 = null;
        if (c1617230sBd != null) {
            str = c1617230sBd.priceCurrencyCode;
            str2 = c1617230sBd.price;
            lValueOf = Long.valueOf(c1617230sBd.priceAmountMicros);
        } else {
            str = null;
            str2 = null;
            lValueOf = null;
        }
        pricePhaseArr[0] = new SubscriptionProductDetail.PricePhase(str, str2, lValueOf);
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(pricePhaseArr);
        TemplateInfo templateInfo = this.templateInfo;
        if (templateInfo != null) {
            str3 = templateInfo.iapId;
        }
        this.subscriptionProductDetail = new SubscriptionProductDetail(str3, "", "", listLJIILJJIL);
    }

    public final void setSubscriptionProductDetail(SubscriptionProductDetail subscriptionProductDetail) {
        this.subscriptionProductDetail = subscriptionProductDetail;
    }

    public final void setTemplateInfo(TemplateInfo templateInfo) {
        this.templateInfo = templateInfo;
    }

    public SubscriptionProductDetailWithTemplateInfo(TemplateInfo templateInfo, SubscriptionProductDetail subscriptionProductDetail) {
        this.templateInfo = templateInfo;
        this.subscriptionProductDetail = subscriptionProductDetail;
    }
}
