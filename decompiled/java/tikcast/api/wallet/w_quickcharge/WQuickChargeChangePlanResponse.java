package tikcast.api.wallet.w_quickcharge;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class WQuickChargeChangePlanResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("contract_id")
        public String contractId = "";

        @C09CT("order_id")
        public String orderId = "";

        @C09CT("payload")
        public String payload = "";

        @C09CT("trigger_status")
        public int triggerStatus;
    }
}
