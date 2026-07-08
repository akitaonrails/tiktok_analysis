package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class PeriodicUserMoneyV2 {

    @C09CT("diamond")
    public long diamond;

    @C09CT("estimated_payout_data")
    public EstimatedPayoutData estimatedPayoutData;

    @C09CT("frozen_amount")
    public long frozenAmount;

    @C09CT("money")
    public long money;

    @C09CT("pending_deduction_amount")
    public long pendingDeductionAmount;

    @C09CT("pipo_manage_method_url")
    public PipoManageMethodUrl pipoManageMethodUrl;

    @C09CT("current_payout_amount")
    public String currentPayoutAmount = "";

    @C09CT("current_payout_time")
    public String currentPayoutTime = "";

    @C09CT("next_payout_amount")
    public String nextPayoutAmount = "";

    @C09CT("next_payout_time")
    public String nextPayoutTime = "";

    @C09CT("current_payout_records")
    public List<BillRecord> currentPayoutRecords = new ArrayList();

    @C09CT("next_payout_records")
    public List<BillRecord> nextPayoutRecords = new ArrayList();

    @C09CT("processing_payout_amount")
    public String processingPayoutAmount = "";

    @C09CT("local_live_earnings")
    public String localLiveEarnings = "";

    @C09CT("local_currency")
    public String localCurrency = "";

    @C09CT("local_currency_symbol")
    public String localCurrencySymbol = "";
}
