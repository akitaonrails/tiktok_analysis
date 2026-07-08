package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class QueryOrderRequestParams {

    @C09CT("source")
    public int source;

    @C09CT("order_id")
    public String orderId = "";

    @C09CT("transaction_id")
    public String transactionId = "";

    @C09CT("campaign_actions")
    public List<CampaignAction> campaignActions = new ArrayList();

    @C09CT("iap_country_code")
    public String iapCountryCode = "";
}
