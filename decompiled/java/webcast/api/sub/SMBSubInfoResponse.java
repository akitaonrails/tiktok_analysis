package webcast.api.sub;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SMBSubInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("package_list")
        public List<SimplePackageInfo> packageList = new ArrayList();

        @C09CT("sub_enabled")
        public boolean subEnabled;

        public static final class SimplePackageInfo {

            @C09CT("emote_count")
            public long emoteCount;

            @C09CT("local_price_amount_micros")
            public long localPriceAmountMicros;

            @C09CT("perk_count")
            public long perkCount;

            @C09CT("package_id")
            public String packageId = "";

            @C09CT("package_name")
            public String packageName = "";

            @C09CT("local_currency_symbol")
            public String localCurrencySymbol = "";

            @C09CT("local_currency")
            public String localCurrency = "";
        }
    }
}
