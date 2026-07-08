package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubscribingInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCAPPBAppLaunchNotificationResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("price_change_notification_list")
        public List<PGCSubscribingInfo> priceChangeNotificationList = new ArrayList();

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;
    }
}
