package tikcast.api.wallet.tiktok;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class DecouplingInfoResult {

    @C09CT("data")
    public DecouplingInfoData data;

    public static final class DecouplingInfoData {

        @C09CT("is_periodic_payout_user")
        public boolean isPeriodicPayoutUser;

        @C09CT("live_studio_popup_key")
        public String liveStudioPopupKey = "";

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }
}
