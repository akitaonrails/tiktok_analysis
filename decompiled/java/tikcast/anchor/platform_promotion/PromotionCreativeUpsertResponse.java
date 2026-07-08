package tikcast.anchor.platform_promotion;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes24.dex */
public final class PromotionCreativeUpsertResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id = "";

        @C09CT("succeed")
        public boolean succeed;
    }
}
