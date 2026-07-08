package tikcast.api.wallet.tiktok;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class BillRecord {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public long status;

    @C09CT("trade_time")
    public long tradeTime;

    @C09CT("version")
    public int version;

    @C09CT("bill_id")
    public String billId = "";

    @C09CT("title")
    public String title = "";

    @C09CT("amount")
    public String amount = "";

    @C09CT("amount_prefix")
    public String amountPrefix = "";

    @C09CT("left_amount")
    public String leftAmount = "";
}
