package tikcast.api.wallet.w_quickcharge;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes24.dex */
public final class WQuickChargeCancelResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("order_id")
        public String orderId = "";

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public String status = "";
    }
}
