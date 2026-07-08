package webcast.api.room_live_studio;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SubmitFeedbackRequest {

    @C09CT("after_sales_response")
    public int afterSalesResponse;

    @C09CT("after_sales_support")
    public int afterSalesSupport;

    @C09CT("delivery_speed")
    public int deliverySpeed;

    @C09CT("encrypted_additional_comment")
    public String encryptedAdditionalComment = "";

    @C09CT("encrypted_aes_key")
    public String encryptedAesKey = "";

    @C09CT("idempotency_key")
    public String idempotencyKey = "";

    @C09CT("lead_id")
    public long leadId;

    @C09CT("overall_satisfaction")
    public int overallSatisfaction;

    @C09CT("product_quality")
    public int productQuality;
}
