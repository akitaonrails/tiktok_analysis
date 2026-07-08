package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PaywallInfoModel {

    @C09CT("after_purchase_popup_redirect_url")
    public final String afterPurchasePopupRedirectUrl;

    @C09CT("after_purchase_redirect_type")
    public final Integer afterPurchaseRedirectType;

    @C09CT("after_purchase_redirect_url")
    public final String afterPurchaseRedirectUrl;

    @C09CT("after_purchase_toast")
    public final String afterPurchaseToast;

    @C09CT("after_subs_popup_redirect_url")
    public final String afterSubsPopupRedirectUrl;

    @C09CT("after_subs_redirect_url")
    public final String afterSubsRedirectUrl;

    @C09CT("after_subs_toast")
    public final String afterSubsToast;

    @C09CT("panel_ori_price")
    public final PriceInfo panelOriPrice;

    @C09CT("panel_show_price")
    public final PriceInfo panelShowPrice;

    @C09CT("paywall_expr_group")
    public final int paywallExpGroup;

    @C09CT("subs_options")
    public final List<VipSubscriptionPurchaseOption> subsOptions;

    public PaywallInfoModel() {
        this(0, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallInfoModel)) {
            return false;
        }
        PaywallInfoModel paywallInfoModel = (PaywallInfoModel) obj;
        return this.paywallExpGroup == paywallInfoModel.paywallExpGroup && Intrinsics.LJFF(this.panelShowPrice, paywallInfoModel.panelShowPrice) && Intrinsics.LJFF(this.panelOriPrice, paywallInfoModel.panelOriPrice) && Intrinsics.LJFF(this.afterPurchaseToast, paywallInfoModel.afterPurchaseToast) && Intrinsics.LJFF(this.afterPurchaseRedirectUrl, paywallInfoModel.afterPurchaseRedirectUrl) && Intrinsics.LJFF(this.afterPurchaseRedirectType, paywallInfoModel.afterPurchaseRedirectType) && Intrinsics.LJFF(this.afterPurchasePopupRedirectUrl, paywallInfoModel.afterPurchasePopupRedirectUrl) && Intrinsics.LJFF(this.subsOptions, paywallInfoModel.subsOptions) && Intrinsics.LJFF(this.afterSubsToast, paywallInfoModel.afterSubsToast) && Intrinsics.LJFF(this.afterSubsRedirectUrl, paywallInfoModel.afterSubsRedirectUrl) && Intrinsics.LJFF(this.afterSubsPopupRedirectUrl, paywallInfoModel.afterSubsPopupRedirectUrl);
    }

    public PaywallInfoModel(int i, PriceInfo priceInfo, PriceInfo priceInfo2, String str, String str2, Integer num, String str3, List<VipSubscriptionPurchaseOption> list, String str4, String str5, String str6) {
        this.paywallExpGroup = i;
        this.panelShowPrice = priceInfo;
        this.panelOriPrice = priceInfo2;
        this.afterPurchaseToast = str;
        this.afterPurchaseRedirectUrl = str2;
        this.afterPurchaseRedirectType = num;
        this.afterPurchasePopupRedirectUrl = str3;
        this.subsOptions = list;
        this.afterSubsToast = str4;
        this.afterSubsRedirectUrl = str5;
        this.afterSubsPopupRedirectUrl = str6;
    }
}
