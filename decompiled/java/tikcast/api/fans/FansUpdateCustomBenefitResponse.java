package tikcast.api.fans;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class FansUpdateCustomBenefitResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("audit_status")
        public int auditStatus;

        @C09CT("benefit_id")
        public String benefitId = "";

        @C09CT("tns_callback_id")
        public String tnsCallbackId = "";
    }
}
