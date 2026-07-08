package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class UpdateBillingAddressResponseV2 {

    @C09CT("data")
    public Data data;

    public static final class BillingAddress {

        @C09CT("country_code")
        public String countryCode = "";

        @C09CT("state_code")
        public String stateCode = "";

        @C09CT("county")
        public String county = "";

        @C09CT("city")
        public String city = "";
    }

    public static final class Data {

        @C09CT("is_saved")
        public boolean isSaved;

        @C09CT("request")
        public BillingAddress request;

        @C09CT("result")
        public BillingAddress result;
    }
}
