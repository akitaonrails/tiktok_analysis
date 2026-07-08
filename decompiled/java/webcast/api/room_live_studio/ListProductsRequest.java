package webcast.api.room_live_studio;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ListProductsRequest {

    @C09CT("order_by")
    public int orderBy;

    @C09CT("page")
    public int page;

    @C09CT("page_size")
    public int pageSize;

    @C09CT("price_max")
    public long priceMax;

    @C09CT("price_min")
    public long priceMin;

    @C09CT("service_type")
    public int serviceType;

    @C09CT("country_code")
    public String countryCode = "";

    @C09CT("state_code")
    public String stateCode = "";

    @C09CT("city_name")
    public String cityName = "";

    @C09CT("currency")
    public String currency = "";
}
