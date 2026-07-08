package com.ss.android.ugc.aweme.payment;

import X.C11NZ;
import X.C2188811AlT;
import X.C844470XAv;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501240pAY;

/* JADX INFO: loaded from: classes25.dex */
public final class MarketplacePaymentApi {
    public static final String LIZ;
    public static CreateOrderApi LIZIZ;

    public interface CreateOrderApi {
        @InterfaceC1501240pAY("/tiktok/v1/paid_content/product/create_order_v2")
        C11NZ<MarketplaceCreateOrderResponse> LIZ(@InterfaceC1501120pAM("sku_ids") String str, @InterfaceC1501120pAM("price_info") String str2, @InterfaceC1501120pAM("discount_id") String str3, @InterfaceC1501120pAM("et_info") String str4, @InterfaceC1501120pAM("purchase_category") Integer num, @InterfaceC1501120pAM("iap_currency_code") String str5);

        @InterfaceC1501160pAQ("/tiktok/v1/paid_content/product/purchased_content")
        C11NZ<PurchaseConfirmationResponse> confirmPurchase(@InterfaceC1501120pAM("order_id") String str);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
