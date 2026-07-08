package tikcast.api.privilege.enigma;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class EnigmaIAPPurchaseRequest {

    @C09CT("product_type")
    public int productType;

    @C09CT("room_id")
    public long roomId;

    @C09CT("product_id")
    public String productId = "";

    @C09CT("iap_payload")
    public String iapPayload = "";

    @C09CT("contract_id")
    public String contractId = "";

    @C09CT("iap_channel")
    public String iapChannel = "";

    @C09CT("app_store_region")
    public String appStoreRegion = "";

    @C09CT("mp_price_point_id")
    public String mpPricePointId = "";
}
