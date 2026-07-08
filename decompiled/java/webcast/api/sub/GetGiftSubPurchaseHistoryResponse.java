package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.subscribe.model.SubscribingInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class GetGiftSubPurchaseHistoryResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_next")
        public boolean hasNext;

        @C09CT("subscribing_info")
        public SubscribingInfo subscribingInfo;

        @C09CT("purchase_list")
        public List<GiftSubPurchaseInfo> purchaseList = new ArrayList();

        @C09CT("monthly_purchase_infos")
        public List<MonthlyPurchaseInfo> monthlyPurchaseInfos = new ArrayList();
    }
}
