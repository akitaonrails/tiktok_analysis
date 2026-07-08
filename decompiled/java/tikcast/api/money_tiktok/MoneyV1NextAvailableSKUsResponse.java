package tikcast.api.money_tiktok;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MoneyV1NextAvailableSKUsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("next_available_skus")
        public Map<String, SKUInfo> nextAvailableSkus = new LinkedHashMap();
    }
}
