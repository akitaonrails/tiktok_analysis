package webcast.api.sub;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class RecoverContractInAppResponse {

    @C09CT("data")
    public RecoverContractInAppResult data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class RecoverContractInAppResult {

        @C09CT("already_succeed")
        public boolean alreadySucceed;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public long status;

        @C09CT("in_app_request")
        public String inAppRequest = "";

        @C09CT("base_plan_id")
        public String basePlanId = "";

        @C09CT("sku_id")
        public String skuId = "";

        @C09CT("contract_id")
        public String contractId = "";
    }

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
