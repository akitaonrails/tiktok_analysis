package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.subscribe.model.SubOnlyLiveInfo;
import com.bytedance.android.livesdk.subscribe.model.SubOptOutStatusInfo;
import com.bytedance.android.livesdk.subscribe.model.SubscribingInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes8.dex */
public final class GetUserSubInfoResponse {

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
        public SubOnlyLiveInfo subOnlyLiveInfo;

        @C09CT("sub_opt_out_status_info")
        public SubOptOutStatusInfo subOptOutStatusInfo;

        @C09CT("sub_scenario")
        public int subScenario;

        @C09CT("subscribing")
        public SubscribingInfo subscribing;

        @C09CT("user_buy_gift_sub_auth")
        public boolean userBuyGiftSubAuth;
    }
}
