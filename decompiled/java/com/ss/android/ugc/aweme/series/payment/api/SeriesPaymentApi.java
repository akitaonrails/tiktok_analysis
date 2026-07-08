package com.ss.android.ugc.aweme.series.payment.api;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501260pAa;
import com.ss.android.ugc.aweme.model.PaidCollectionPaymentResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionRefundResponse;
import com.ss.android.ugc.aweme.model.VideoPurchaseConfirmationResponse;
import com.ss.android.ugc.aweme.payment.MarketplaceCreateOrderResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesPaymentApi {
    public static CreateOrderApi LIZ;
    public static SubmitRefundApi LIZIZ;

    public interface CreateOrderApi {
        @InterfaceC1501240pAY("/tiktok/v1/paid_content/product/create_order_v2")
        C11NZ<MarketplaceCreateOrderResponse> LIZ(@InterfaceC1501260pAa Map<String, Object> map);

        @InterfaceC1501200pAU("/tiktok/v1/paid_content/collection/video/purchase_confirmation")
        AbstractC19484711Kz<VideoPurchaseConfirmationResponse> confirmPurchase(@InterfaceC1501070pAH("collection_id") long j, @InterfaceC1501070pAH("paid_content_order_id") String str);

        @InterfaceC1501240pAY("/tiktok/v1/paid_content/product/create_order")
        C11NZ<PaidCollectionPaymentResponse> createOrder(@InterfaceC1501070pAH("business_type") int i, @InterfaceC1501070pAH("product_id") long j, @InterfaceC1501070pAH("entry_source") int i2, @InterfaceC1501070pAH("voucher_id") Long l, @InterfaceC1501070pAH("iap_currency_code") String str, @InterfaceC1501070pAH("first_unpurchased_seq_id") Integer num, @InterfaceC1501070pAH("num_videos") Integer num2, @InterfaceC1501070pAH("purchase_category") Integer num3, @InterfaceC1501070pAH("enter_from") String str2, @InterfaceC1501070pAH("et_info") String str3);
    }

    public interface SubmitRefundApi {
        @InterfaceC1501240pAY("/tiktok/v1/paid_content/product/refund")
        C11NZ<PaidCollectionRefundResponse> submitRefund(@InterfaceC1501070pAH("business_type") int i, @InterfaceC1501070pAH("product_id") long j, @InterfaceC1501070pAH("order_id") String str, @InterfaceC1501070pAH("refund_reason_enum") int i2, @InterfaceC1501070pAH("refund_reason") String str2);
    }
}
