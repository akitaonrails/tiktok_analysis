package webcast.api.profit;

import X.C09CT;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.List;
import webcast.api.profit.IapListResult;
import webcast.data.CurrencyInfo;
import webcast.data.FXRate;

/* JADX INFO: loaded from: classes28.dex */
public final class ListV3Result {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("list")
        public List<Diamond> list = new ArrayList();

        @C09CT("list_v3")
        public List<Diamond> listV3 = new ArrayList();
    }

    public static final class Extra {

        @C09CT("default_packet_coin")
        public long defaultPacketCoin;

        @C09CT("has_pipo_recharge_before")
        public boolean hasPipoRechargeBefore;

        @C09CT("iap_custom_data")
        public IapListResult.IapCustomData iapCustomData;

        @C09CT("is_iap_enabled")
        public boolean isIapEnabled;

        @C09CT("is_new_recommend_package")
        public boolean isNewRecommendPackage;

        @C09CT("is_recharge_v3")
        public boolean isRechargeV3;

        @C09CT("last_tab")
        public int lastTab;

        @C09CT("max_customized_diamond_cnt")
        public int maxCustomizedDiamondCnt;

        @C09CT("min_customized_diamond_cnt")
        public int minCustomizedDiamondCnt;

        @C09CT("need_display_multi_currency")
        public boolean needDisplayMultiCurrency;

        @C09CT("recently_purchased_packet_id")
        public long recentlyPurchasedPacketId;

        @C09CT("recharge_v3_version")
        public int rechargeV3Version;

        @C09CT("recommended_packet_id")
        public long recommendedPacketId;

        @C09CT("recommended_packet_id_v3")
        public long recommendedPacketIdV3;

        @C09CT("use_recharge_v3_store_region")
        public boolean useRechargeV3StoreRegion;

        @C09CT("customized_ids")
        public List<Long> customizedIds = new ArrayList();

        @C09CT("merchant_id")
        public String merchantId = "";

        @C09CT("region")
        public String region = "";

        @C09CT("request_id")
        public String requestId = "";

        @C09CT("voucher_list")
        public List<IapListResult.VoucherItem> voucherList = new ArrayList();

        @C09CT("voucher_list_v3")
        public List<IapListResult.VoucherItem> voucherListV3 = new ArrayList();

        @C09CT("pipo_domain")
        public String pipoDomain = "";

        @C09CT("store_region")
        public String storeRegion = "";

        @C09CT("recharge_v3_cashier_url")
        public String rechargeV3CashierUrl = "";

        @C09CT("frequent_diamond_counts")
        public List<Integer> frequentDiamondCounts = new ArrayList();

        @C09CT("frequent_diamond_currency_amount")
        public List<String> frequentDiamondCurrencyAmount = new ArrayList();

        @C09CT("full_list")
        public List<Diamond> fullList = new ArrayList();

        @C09CT("cus_recharge_url")
        public String cusRechargeUrl = "";

        @C09CT("available_currency_list")
        public List<CurrencyInfo> availableCurrencyList = new ArrayList();

        @C09CT("last_selected_currency")
        public String lastSelectedCurrency = "";

        @C09CT("default_local_currency")
        public String defaultLocalCurrency = "";

        @C09CT("local_currency_list")
        public List<String> localCurrencyList = new ArrayList();

        @C09CT("multi_currency_display_fx_rate_list")
        public List<FXRate> multiCurrencyDisplayFxRateList = new ArrayList();
    }
}
