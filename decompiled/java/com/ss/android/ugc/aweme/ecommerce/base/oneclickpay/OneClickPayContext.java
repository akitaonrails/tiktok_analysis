package com.ss.android.ugc.aweme.ecommerce.base.oneclickpay;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OneClickPayContext implements Serializable {
    public static final int $stable = 8;

    @C09CT("address_id")
    public final String buyerAddressId;

    @C09CT("combination_payment_tips")
    public final String combinationPaymentDes;

    @C09CT("combination_payment_method_info_list")
    public final List<CombinationPaymentMethodInfo> combinationPaymentList;

    @C09CT("logistics_service_id")
    public final String logisticsServiceId;

    @C09CT("main_order_id")
    public final String mainOrderId;

    @C09CT("pay_method_select_enable")
    public final Integer payMethodSelectEnable;

    @C09CT("payment_card_num")
    public final String paymentCardNum;

    @C09CT("payment_card_url")
    public final String paymentCardUrl;

    @C09CT("payment_card_url_dark")
    public final String paymentCardUrlDark;

    @C09CT("pmid")
    public final String paymentId;

    @C09CT("payment_method_text")
    public final String paymentMethodText;

    @C09CT("payment_token")
    public final String paymentToken;

    public OneClickPayContext(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<CombinationPaymentMethodInfo> list, Integer num) {
        this.paymentId = str;
        this.paymentToken = str2;
        this.buyerAddressId = str3;
        this.mainOrderId = str4;
        this.logisticsServiceId = str5;
        this.paymentCardUrl = str6;
        this.paymentCardUrlDark = str7;
        this.paymentMethodText = str8;
        this.paymentCardNum = str9;
        this.combinationPaymentDes = str10;
        this.combinationPaymentList = list;
        this.payMethodSelectEnable = num;
    }
}
