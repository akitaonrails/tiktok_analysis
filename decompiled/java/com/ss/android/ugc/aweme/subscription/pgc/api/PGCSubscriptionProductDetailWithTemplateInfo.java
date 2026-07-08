package com.ss.android.ugc.aweme.subscription.pgc.api;

import X.C09CT;
import X.C13LP;
import X.C1617230sBd;
import X.C1697810uHb;
import X.C2188811AlT;
import com.bytedance.android.livesdk.iap.IapSubscriptionOfferPricing;
import com.bytedance.android.livesdk.iap.IapSubscriptionProduct;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetail;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCSubscriptionProductDetailWithTemplateInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("product_detail")
    public PGCSubscriptionProductDetail subscriptionProductDetail;

    @C09CT("template_info")
    public transient TemplateInfo templateInfo;

    public PGCSubscriptionProductDetailWithTemplateInfo() {
        this(null, null);
    }

    public String toString() {
        List<PGCSubscriptionProductDetail.PricePhase> pricePhaseList;
        PGCSubscriptionProductDetail.PricePhase pricePhase;
        List<PGCSubscriptionProductDetail.PricePhase> pricePhaseList2;
        PGCSubscriptionProductDetail.PricePhase pricePhase2;
        List<PGCSubscriptionProductDetail.PricePhase> pricePhaseList3;
        OfferInfo offerInfo;
        OfferInfo offerInfo2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateInfo: iap_id=");
        TemplateInfo templateInfo = this.templateInfo;
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
        PGCSubscriptionProductDetail pGCSubscriptionProductDetail = this.subscriptionProductDetail;
        sbLIZ.append(pGCSubscriptionProductDetail != null ? pGCSubscriptionProductDetail.getSkuName() : null);
        sbLIZ.append(", price_size=");
        PGCSubscriptionProductDetail pGCSubscriptionProductDetail2 = this.subscriptionProductDetail;
        sbLIZ.append((pGCSubscriptionProductDetail2 == null || (pricePhaseList3 = pGCSubscriptionProductDetail2.getPricePhaseList()) == null) ? null : Integer.valueOf(pricePhaseList3.size()));
        sbLIZ.append(" original_price=");
        PGCSubscriptionProductDetail pGCSubscriptionProductDetail3 = this.subscriptionProductDetail;
        sbLIZ.append((pGCSubscriptionProductDetail3 == null || (pricePhaseList2 = pGCSubscriptionProductDetail3.getPricePhaseList()) == null || (pricePhase2 = (PGCSubscriptionProductDetail.PricePhase) C13LP.LJJLIIIJL(pricePhaseList2)) == null) ? null : pricePhase2.getPrice());
        sbLIZ.append(", offer_price=");
        PGCSubscriptionProductDetail pGCSubscriptionProductDetail4 = this.subscriptionProductDetail;
        sbLIZ.append((pGCSubscriptionProductDetail4 == null || (pricePhaseList = pGCSubscriptionProductDetail4.getPricePhaseList()) == null || (pricePhase = (PGCSubscriptionProductDetail.PricePhase) C13LP.LJJJLL(pricePhaseList)) == null) ? null : pricePhase.getPrice());
        sbLIZ.append(", iap_client_param=");
        PGCSubscriptionProductDetail pGCSubscriptionProductDetail5 = this.subscriptionProductDetail;
        sbLIZ.append(pGCSubscriptionProductDetail5 != null ? pGCSubscriptionProductDetail5.getIapClientParams() : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PGCSubscriptionProductDetail getSubscriptionProductDetail() {
        return this.subscriptionProductDetail;
    }

    public final TemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    public final void setSubscriptionProductDetail(PGCSubscriptionProductDetail pGCSubscriptionProductDetail) {
        this.subscriptionProductDetail = pGCSubscriptionProductDetail;
    }

    public final void setTemplateInfo(TemplateInfo templateInfo) {
        this.templateInfo = templateInfo;
    }

    public PGCSubscriptionProductDetailWithTemplateInfo(TemplateInfo templateInfo, PGCSubscriptionProductDetail pGCSubscriptionProductDetail) {
        this.templateInfo = templateInfo;
        this.subscriptionProductDetail = pGCSubscriptionProductDetail;
    }

    public final void setAutoDeductionDetail(IapSubscriptionProduct iapSubscriptionProduct, String str) {
        String str2;
        String str3;
        List<IapSubscriptionOfferPricing> list;
        ArrayList arrayList = new ArrayList();
        if (iapSubscriptionProduct != null && (list = iapSubscriptionProduct.pricingPhases) != null) {
            for (IapSubscriptionOfferPricing iapSubscriptionOfferPricing : list) {
                arrayList.add(new PGCSubscriptionProductDetail.PricePhase(iapSubscriptionOfferPricing.priceCurrencyCode, iapSubscriptionOfferPricing.price, Long.valueOf(iapSubscriptionOfferPricing.priceAmountMicros)));
            }
        }
        TemplateInfo templateInfo = this.templateInfo;
        String str4 = null;
        if (templateInfo != null) {
            str2 = templateInfo.iapId;
        } else {
            str2 = null;
        }
        if (iapSubscriptionProduct != null) {
            str4 = iapSubscriptionProduct.offerId;
            str3 = iapSubscriptionProduct.offerToken;
        } else {
            str3 = null;
        }
        this.subscriptionProductDetail = new PGCSubscriptionProductDetail(str2, str4, str3, arrayList, str);
    }

    public final void setOneTimeProductDetail(C1617230sBd c1617230sBd, String str) {
        String str2;
        String str3;
        Long lValueOf;
        PGCSubscriptionProductDetail.PricePhase[] pricePhaseArr = new PGCSubscriptionProductDetail.PricePhase[1];
        String str4 = null;
        if (c1617230sBd != null) {
            str2 = c1617230sBd.priceCurrencyCode;
            str3 = c1617230sBd.price;
            lValueOf = Long.valueOf(c1617230sBd.priceAmountMicros);
        } else {
            str2 = null;
            str3 = null;
            lValueOf = null;
        }
        pricePhaseArr[0] = new PGCSubscriptionProductDetail.PricePhase(str2, str3, lValueOf);
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(pricePhaseArr);
        TemplateInfo templateInfo = this.templateInfo;
        if (templateInfo != null) {
            str4 = templateInfo.iapId;
        }
        this.subscriptionProductDetail = new PGCSubscriptionProductDetail(str4, "", "", listLJIILJJIL, str);
    }
}
