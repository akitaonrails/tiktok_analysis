package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class ClaimRuleV2 {

    @C09CT("enter_source_claim_condition")
    public EnterSourceClaimCondition enterSourceClaimCondition;

    @C09CT("max_coins_claim_condition")
    public MaxCoinsClaimCondition maxCoinsClaimCondition;

    @C09CT("min_coins_claim_condition")
    public MinCoinsClaimCondition minCoinsClaimCondition;

    @C09CT("min_local_spend")
    public MinLocalSpend minLocalSpend;

    @C09CT("allowed_payment_methods")
    public List<String> allowedPaymentMethods = new ArrayList();

    @C09CT("allowed_recharge_currency")
    public String allowedRechargeCurrency = "";

    @C09CT("allowed_currencies")
    public List<String> allowedCurrencies = new ArrayList();

    @C09CT("min_spend_local")
    public Map<String, CurrencyAmount> minSpendLocal = new LinkedHashMap();
}
