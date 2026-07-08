package tikcast.api.privilege.enigma;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EnigmaProductsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("enigma_product_details")
        public List<EnigmaIAPProductDetails> enigmaProductDetails = new ArrayList();

        @C09CT("remaining_subscription_days")
        public int remainingSubscriptionDays;

        /* JADX INFO: loaded from: classes32.dex */
        public static final class EnigmaIAPProductDetails {

            @C09CT("can_purchase")
            public boolean canPurchase;

            @C09CT("iap_local_price")
            public PriceDetail iapLocalPrice;

            @C09CT("iap_usd_price")
            public PriceDetail iapUsdPrice;

            @C09CT("is_subscription")
            public boolean isSubscription;

            @C09CT("renew_period")
            public String renewPeriod = "";

            @C09CT("mp_product_id")
            public String mpProductId = "";

            @C09CT("mp_price_point_id")
            public String mpPricePointId = "";

            @C09CT("mp_sku_id")
            public String mpSkuId = "";

            @C09CT("mp_base_plan_id")
            public String mpBasePlanId = "";

            @C09CT("mp_offer_id")
            public String mpOfferId = "";
        }
    }
}
