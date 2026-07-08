package tikcast.api.wallet.tiktok;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveRewardRecordsResult {

    @C09CT("data")
    public LiveRewardRecordsData data;

    public static final class AccountBillRecord {

        @C09CT("status_type")
        public long statusType;

        @C09CT("version")
        public int version;

        @C09CT("bill_id")
        public String billId = "";

        @C09CT("title")
        public String title = "";

        @C09CT("trade_time")
        public String tradeTime = "";

        @C09CT("amount")
        public String amount = "";

        @C09CT("amount_prefix")
        public String amountPrefix = "";

        @C09CT("left_amount")
        public String leftAmount = "";

        @C09CT("room_id")
        public String roomId = "";

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public String status = "";
    }

    public static final class LiveRewardRecordsData {

        @C09CT("pagination")
        public Pagination pagination;

        @C09CT("records")
        public List<AccountBillRecord> records = new ArrayList();

        @C09CT("summaries")
        public Map<String, MonthSummary> summaries = new LinkedHashMap();
    }

    public static final class MonthSummary {

        @C09CT("pay_in")
        public String payIn = "";

        @C09CT("pay_out")
        public String payOut = "";
    }

    public static final class Pagination {

        @C09CT("last_bill_id")
        public String lastBillId = "";

        @C09CT("start_time")
        public long startTime;
    }
}
