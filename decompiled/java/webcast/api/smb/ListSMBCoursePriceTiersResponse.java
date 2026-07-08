package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.PriceTier;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ListSMBCoursePriceTiersResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("can_change_price_timestamp")
        public long canChangePriceTimestamp;

        @C09CT("price_tier_list")
        public List<PriceTier> priceTierList = new ArrayList();
    }
}
