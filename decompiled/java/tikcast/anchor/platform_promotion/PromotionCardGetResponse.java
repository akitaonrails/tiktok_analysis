package tikcast.anchor.platform_promotion;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class PromotionCardGetResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("approval_url")
        public String approvalUrl = "";

        @C09CT("card")
        public PromotionCardStruct card;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("succeed")
        public boolean succeed;
    }
}
