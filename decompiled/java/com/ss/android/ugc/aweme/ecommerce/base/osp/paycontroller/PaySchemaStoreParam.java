package com.ss.android.ugc.aweme.ecommerce.base.osp.paycontroller;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PostOrderSchema;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaySchemaStoreParam {

    @C09CT("btm_token")
    public final String btmToken;

    @C09CT("from_second_pay")
    public final Boolean fromSecondPay;

    @C09CT("mall_ab")
    public final Integer mallAb;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("post_order_schemas")
    public final List<PostOrderSchema> postOrderSchemas;

    public PaySchemaStoreParam(List<PostOrderSchema> list, String str, Integer num, Boolean bool, String str2) {
        this.postOrderSchemas = list;
        this.paymentMethodId = str;
        this.mallAb = num;
        this.fromSecondPay = bool;
        this.btmToken = str2;
    }
}
