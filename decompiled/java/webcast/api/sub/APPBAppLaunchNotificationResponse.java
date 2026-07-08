package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.subscribe.model.SubscribingInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class APPBAppLaunchNotificationResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("price_change_notification_list")
        public List<SubscribingInfo> priceChangeNotificationList = new ArrayList();
    }
}
