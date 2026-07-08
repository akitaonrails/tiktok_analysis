package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ChangeOrderShippingAddressResponseData {

    @C09CT("errors")
    public final List<Error> errors;

    @C09CT("otp_biz_scene")
    public final Integer otpBizScene;

    @C09CT("result_code")
    public final Integer resultCode;

    @C09CT("scheme")
    public final String scheme;

    @C09CT("toast_message")
    public final String toastMessage;

    public ChangeOrderShippingAddressResponseData(Integer num, String str, List<Error> list, String str2, Integer num2) {
        this.resultCode = num;
        this.toastMessage = str;
        this.errors = list;
        this.scheme = str2;
        this.otpBizScene = num2;
    }
}
