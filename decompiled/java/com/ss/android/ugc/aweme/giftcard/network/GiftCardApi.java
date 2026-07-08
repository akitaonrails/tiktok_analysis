package com.ss.android.ugc.aweme.giftcard.network;

import X.C040I;
import X.C1717540unQ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501370pAl;

/* JADX INFO: loaded from: classes27.dex */
public interface GiftCardApi {
    public static final C1717540unQ LIZ = C1717540unQ.LIZ;

    @InterfaceC1501170pAR("/wallet/v1/giftcard/query_giftcard_checkout_info")
    Object getCheckoutInfo(@InterfaceC1501370pAl("pipo-fp-session-id") String str, @C040I GiftCardRequestWrapper giftCardRequestWrapper, InterfaceC1364105Vn<? super PipoResultWrapper> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/giftcard/pay_digital_goods")
    Object payDigitalGoods(@InterfaceC1501370pAl("pipo-fp-session-id") String str, @C040I GiftCardRequestWrapper giftCardRequestWrapper, InterfaceC1364105Vn<? super PipoResultWrapper> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/wallet/v1/giftcard/query_digital_goods_order")
    Object queryDigitalGoodsOrder(@InterfaceC1501370pAl("pipo-fp-session-id") String str, @C040I GiftCardRequestWrapper giftCardRequestWrapper, InterfaceC1364105Vn<? super PipoResultWrapper> interfaceC1364105Vn);
}
