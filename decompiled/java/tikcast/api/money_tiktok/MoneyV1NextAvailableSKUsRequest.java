package tikcast.api.money_tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class MoneyV1NextAvailableSKUsRequest {

    @C09CT("mid")
    public String mid = "";

    @C09CT("common_sku_ids")
    public List<String> commonSkuIds = new ArrayList();

    @C09CT("channel_sku_ids")
    public List<String> channelSkuIds = new ArrayList();

    @C09CT("price_region")
    public String priceRegion = "";
}
