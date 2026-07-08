package webcast.api.room_live_studio;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProductCard {

    @C09CT("order_cnt")
    public long orderCnt;

    @C09CT("price_max")
    public long priceMax;

    @C09CT("price_min")
    public long priceMin;

    @C09CT("product_id")
    public long productId;

    @C09CT("service_type")
    public int serviceType;

    @C09CT("supplier_id")
    public long supplierId;

    @C09CT("supplier_tier")
    public int supplierTier;

    @C09CT("title")
    public String title = "";

    @C09CT("supplier_name")
    public String supplierName = "";

    @C09CT("currency")
    public String currency = "";

    @C09CT("image_tags")
    public List<ImageTag> imageTags = new ArrayList();

    @C09CT("price_min_display")
    public String priceMinDisplay = "";

    @C09CT("price_max_display")
    public String priceMaxDisplay = "";
}
