package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentAppealHelper;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentAssuranceAppealRequestContent {

    @C09CT("appeal_id")
    public final String appealId;

    @C09CT("appeal_object")
    public final List<PaymentAppealHelper.AppealObject> appealObject;

    @C09CT("appeal_object_list")
    public final List<List<PaymentAppealHelper.AppealObject>> appealObjectList;

    @C09CT("appeal_type")
    public final Integer appealType;

    @C09CT("callback_url")
    public final String callbackUrl;

    @C09CT("custom_tag")
    public final Map<String, String> customTag;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_order_id")
    public final String merchantOrderId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("nonce")
    public final String nonce;

    @C09CT("redirect_url")
    public final String redirectUrl;

    @C09CT("tt_uid")
    public final String ttUid;

    @C09CT("wallet_user_id")
    public final String walletUserId;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentAssuranceAppealRequestContent(String str, String str2, String str3, String str4, String str5, Integer num, List<PaymentAppealHelper.AppealObject> list, List<? extends List<PaymentAppealHelper.AppealObject>> list2, String str6, String str7, String str8, Map<String, String> map, String str9) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.walletUserId = str3;
        this.ttUid = str4;
        this.appealId = str5;
        this.appealType = num;
        this.appealObject = list;
        this.appealObjectList = list2;
        this.callbackUrl = str6;
        this.redirectUrl = str7;
        this.merchantOrderId = str8;
        this.customTag = map;
        this.nonce = str9;
    }
}
