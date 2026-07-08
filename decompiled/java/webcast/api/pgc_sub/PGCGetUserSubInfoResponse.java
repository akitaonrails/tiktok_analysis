package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubOnlyLiveInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubOptOutStatusInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubscribingInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCGetUserSubInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("auto_renewal_cancellation_status")
        public int autoRenewalCancellationStatus;

        @C09CT("has_sub_only_space")
        public boolean hasSubOnlySpace;

        @C09CT("room_info")
        public Room roomInfo;

        @C09CT("scenario_text")
        public String scenarioText = "";

        @C09CT("sub_only_live_info")
        public PGCSubOnlyLiveInfo subOnlyLiveInfo;

        @C09CT("sub_opt_out_status_info")
        public PGCSubOptOutStatusInfo subOptOutStatusInfo;

        @C09CT("sub_scenario")
        public int subScenario;

        @C09CT("subscribing")
        public PGCSubscribingInfo subscribing;

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;

        @C09CT("user_buy_gift_sub_auth")
        public boolean userBuyGiftSubAuth;
    }
}
