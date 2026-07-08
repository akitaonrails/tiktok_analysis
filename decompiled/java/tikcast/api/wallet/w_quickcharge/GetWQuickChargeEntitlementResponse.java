package tikcast.api.wallet.w_quickcharge;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class GetWQuickChargeEntitlementResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("is_eligible")
        public boolean isEligible;

        @C09CT("contract_infos")
        public List<WATUCoinContractInfo> contractInfos = new ArrayList();

        @C09CT("default_billing_address")
        public String defaultBillingAddress = "";

        @C09CT("merchant_id")
        public String merchantId = "";

        @C09CT("pipo_domain")
        public String pipoDomain = "";
    }

    public static final class WATUCoinContractInfo {

        @C09CT("activated_before")
        public boolean activatedBefore;

        @C09CT("coin_count")
        public long coinCount;

        @C09CT("daily_cap")
        public long dailyCap;

        @C09CT("daily_limit")
        public long dailyLimit;

        @C09CT("has_valid_biz_contract")
        public boolean hasValidBizContract;

        @C09CT("new_daily_cap")
        public long newDailyCap;

        @C09CT("package_id")
        public long packageId;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("status_reason")
        public int statusReason;

        @C09CT("threshold")
        public long threshold;

        @C09CT("contract_id")
        public String contractId = "";

        @C09CT("channel")
        public String channel = "";

        @C09CT("billing_address")
        public String billingAddress = "";
    }
}
