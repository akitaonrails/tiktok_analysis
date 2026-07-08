package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class GetBillFlowTypeInfoResponseData {

    @C09CT("disable_one_step_checkout")
    public final Boolean disableOneStepCheckout;

    @C09CT("is_first_paid")
    public final Boolean firstPaid;

    @C09CT("has_address")
    public final Boolean hasAddress;

    @C09CT("saved_payment_method_list")
    public final List<String> paymentList;

    @C09CT("screen_type")
    public final Integer screenType;

    public GetBillFlowTypeInfoResponseData(Boolean bool, List<String> list, Boolean bool2, Integer num, Boolean bool3) {
        this.hasAddress = bool;
        this.paymentList = list;
        this.firstPaid = bool2;
        this.screenType = num;
        this.disableOneStepCheckout = bool3;
    }
}
