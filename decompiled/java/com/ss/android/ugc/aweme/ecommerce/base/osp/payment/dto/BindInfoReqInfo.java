package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BindInfoReqInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("commute_type")
    public final CommuteType bindCommuteType;

    @C09CT("deeplink")
    public final String deepLink;

    @C09CT("idempotency_key")
    public final String idempotencyKey;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("scene_tag")
    public final List<String> sceneTag;

    public BindInfoReqInfo() {
        this(null, null, null, null, null, null);
    }

    public BindInfoReqInfo(String str, String str2, String str3, CommuteType commuteType, String str4, List<String> list) {
        this.paymentMethodId = str;
        this.paymentMethodToken = str2;
        this.idempotencyKey = str3;
        this.bindCommuteType = commuteType;
        this.deepLink = str4;
        this.sceneTag = list;
    }
}
