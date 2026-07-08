package tikcast.api.wallet.w_quickcharge;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class WQuickChargeChangePlanRequestParams {

    @C09CT("daily_cap")
    public long dailyCap;

    @C09CT("daily_limit")
    public long dailyLimit;

    @C09CT("package_id")
    public long packageId;

    @C09CT("threshold")
    public long threshold;

    @C09CT("contract_id")
    public String contractId = "";

    @C09CT("billing_address")
    public String billingAddress = "";

    @C09CT("payment_method_id")
    public String paymentMethodId = "";

    @C09CT("payment_method_token")
    public String paymentMethodToken = "";

    @C09CT("payment_method")
    public String paymentMethod = "";

    @C09CT("enter_source")
    public String enterSource = "";
}
