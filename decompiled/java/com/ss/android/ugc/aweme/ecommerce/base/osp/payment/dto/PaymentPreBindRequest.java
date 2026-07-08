package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentPreBindRequest {

    @C09CT("currency")
    public final String currency;

    @C09CT("extra_info")
    public final String extraInfo;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("scene_tag")
    public final List<String> sceneTag;

    @C09CT("version")
    public final String version;

    public PaymentPreBindRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public PaymentPreBindRequest(String str, String str2, String str3, String str4, List<String> list, String str5) {
        this.merchantUserId = str;
        this.paymentMethodId = str2;
        this.currency = str3;
        this.extraInfo = str4;
        this.sceneTag = list;
        this.version = str5;
    }

    public PaymentPreBindRequest(String str, String str2, String str3, String str4, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? C13BV.INSTANCE : list, (i & 32) == 0 ? str5 : null);
    }
}
