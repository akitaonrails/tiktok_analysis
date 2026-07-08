package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes2.dex */
public final class SetPrimaryPIRequest {

    @C09CT("agreement_id")
    public final String agreementId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("region")
    public final String region;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer sceneTag;

    @C09CT("seller_id")
    public final String sellerId;

    @C09CT("verify_id")
    public final String verifyId;

    public SetPrimaryPIRequest(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8) {
        this.sellerId = str;
        this.merchantUserId = str2;
        this.agreementId = str3;
        this.region = str4;
        this.paymentMethodToken = str5;
        this.paymentMethodId = str6;
        this.sceneTag = num;
        this.verifyId = str7;
        this.pipoErrorCodeParams = str8;
    }
}
