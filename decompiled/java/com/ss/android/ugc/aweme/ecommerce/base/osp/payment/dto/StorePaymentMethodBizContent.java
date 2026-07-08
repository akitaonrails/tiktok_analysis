package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C786410Ut5;
import X.C900203fU;
import com.bytedance.scene.Scene;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class StorePaymentMethodBizContent {

    @C09CT("agreement_id")
    public final String agreementId;

    @C09CT("amount")
    public final Amount amount;

    @C09CT("configuration")
    public final C900203fU configuration;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("idempotency_key")
    public final String idempotencyKey;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("next_mit")
    public final Boolean nextMit;

    @C09CT("nonce")
    public final String nonce;

    @C09CT("notification_url")
    public final String notificationUrl;

    @C09CT("notify_type")
    public final Integer notifyType;

    @C09CT("payment_method")
    public final JSONObject paymentMethod;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    @C09CT("payment_reference")
    public final String paymentReference;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("return_url")
    public final String returnUrl;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("scene_tag")
    public final List<String> sceneTag;

    @C09CT("with_agreement")
    public final Boolean withAgreement;

    public StorePaymentMethodBizContent() {
        this(null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null);
    }

    public final String LIZ() {
        JSONObject jSONObject = new JSONObject();
        C900203fU c900203fU = this.configuration;
        jSONObject.put("configuration", c900203fU != null ? c900203fU.LIZLLL() : null);
        jSONObject.put("merchant_id", this.merchantId);
        jSONObject.put("merchant_user_id", this.merchantUserId);
        jSONObject.put("idempotency_key", this.idempotencyKey);
        jSONObject.put("payment_method", this.paymentMethod);
        jSONObject.put("return_url", this.returnUrl);
        jSONObject.put("risk_info", this.riskInfo);
        jSONObject.put("notification_url", this.notificationUrl);
        jSONObject.put("notify_type", this.notifyType);
        jSONObject.put("with_agreement", this.withAgreement);
        jSONObject.put("country_or_region", this.countryOrRegion);
        jSONObject.put("nonce", this.nonce);
        jSONObject.put("payment_method_token", this.paymentMethodToken);
        jSONObject.put(Scene.SCENE_SERVICE, this.scene);
        jSONObject.put("agreement_id", this.agreementId);
        jSONObject.put("next_mit", this.nextMit);
        jSONObject.put("scene_tag", new JSONArray((Collection) this.sceneTag));
        jSONObject.put("amount", (Object) null);
        jSONObject.put("pipo_error_code_params", this.pipoErrorCodeParams);
        jSONObject.put("payment_reference", this.paymentReference);
        return C786410Ut5.J3(jSONObject);
    }

    public StorePaymentMethodBizContent(C900203fU c900203fU, String str, String str2, String str3, JSONObject jSONObject, String str4, String str5, String str6, Integer num, Boolean bool, String str7, String str8, Amount amount, String str9, String str10, String str11, Boolean bool2, List<String> list, String str12, String str13) {
        this.configuration = c900203fU;
        this.merchantId = str;
        this.merchantUserId = str2;
        this.idempotencyKey = str3;
        this.paymentMethod = jSONObject;
        this.returnUrl = str4;
        this.riskInfo = str5;
        this.notificationUrl = str6;
        this.notifyType = num;
        this.withAgreement = bool;
        this.countryOrRegion = str7;
        this.nonce = str8;
        this.amount = amount;
        this.paymentMethodToken = str9;
        this.scene = str10;
        this.agreementId = str11;
        this.nextMit = bool2;
        this.sceneTag = list;
        this.pipoErrorCodeParams = str12;
        this.paymentReference = str13;
    }
}
