package tikcast.api.wallet;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentMethod {

    @C09CT("cvv_is_collected")
    public boolean cvvIsCollected;

    @C09CT("is_cci")
    public boolean isCci;

    @C09CT("payment_method_info_v2")
    public PaymentMethodInfoV2 paymentMethodInfoV2;

    @C09CT("tenure")
    public int tenure;

    @C09CT("payment_method_id")
    public String paymentMethodId = "";

    @C09CT("payment_method_token")
    public String paymentMethodToken = "";

    @C09CT("payment_elements")
    public List<PaymentElement> paymentElements = new ArrayList();

    @C09CT("method_type")
    public String methodType = "";

    @C09CT("payment_method")
    public String paymentMethod = "";

    @C09CT("integration_type")
    public String integrationType = "";

    @C09CT("type")
    public String type = "";

    @C09CT("agreement_type")
    public String agreementType = "";

    @C09CT("agreement_id")
    public String agreementId = "";

    @C09CT("user_type")
    public String userType = "";

    @C09CT("mandate_info")
    public List<MandateData> mandateInfo = new ArrayList();

    @C09CT("method_id")
    public String methodId = "";

    @C09CT("trade_type")
    public String tradeType = "";

    @C09CT("installment_plan_id")
    public String installmentPlanId = "";

    @C09CT("pipo_bank_code")
    public String pipoBankCode = "";

    @C09CT("model")
    public String model = "";

    @C09CT("installment_option_id")
    public String installmentOptionId = "";

    @C09CT("payment_channel_compositions")
    public List<PaymentChannelComposition> paymentChannelCompositions = new ArrayList();
}
