package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class BehaviorTrackResult {

    @C09CT("behavior_data")
    public BehaviorData behaviorData;

    @C09CT("resp")
    public Response resp;

    public static final class Response {

        @C09CT("err_msg")
        public String errMsg = "";

        @C09CT("result_code")
        public int resultCode;
    }
}
