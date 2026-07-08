package tikcast.api.wallet.tiktok;

import X.C09CT;
import X.C2097608Jq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class InfoResult {

    @C09CT("data")
    public InfoData data;

    public static final class InfoData {

        @C09CT("auto_exchange")
        public boolean autoExchange;

        @C09CT("auto_exchange_enable")
        public boolean autoExchangeEnable;

        @C09CT("auto_exchange_supported")
        public boolean autoExchangeSupported;

        @C09CT("auto_send")
        public boolean autoSend;

        @C09CT("coin_exchange_tax_status")
        public int coinExchangeTaxStatus;

        @C09CT("coin_exchange_tax_type")
        public int coinExchangeTaxType;

        @C09CT("coins_balance_version")
        public long coinsBalanceVersion;

        @C09CT("coins_balance_version_v2")
        public long coinsBalanceVersionV2;

        @C09CT("deprecated1")
        public long deprecated1;

        @C09CT("deprecated5")
        public long deprecated5;

        @C09CT("diamond")
        public long diamond;

        @C09CT("exchange")
        public Exchange exchange;

        @C09CT("frozen_diamond")
        public long frozenDiamond;

        @C09CT("is_periodic_payout")
        public boolean isPeriodicPayout;

        @C09CT("deprecated2")
        public String deprecated2 = "";

        @C09CT("deprecated3")
        public String deprecated3 = "";

        @C09CT("deprecated4")
        public List<CouponDetailData> deprecated4 = new ArrayList();

        @C09CT("auto_exchange_map")
        public Map<String, Boolean> autoExchangeMap = C2097608Jq.LJ();
    }
}
