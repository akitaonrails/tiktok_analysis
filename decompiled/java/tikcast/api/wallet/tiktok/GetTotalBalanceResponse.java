package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class GetTotalBalanceResponse {

    @C09CT("data")
    public GetTotalBalanceData data;

    public static final class BalanceInfo {

        @C09CT("decimal_place")
        public int decimalPlace;

        @C09CT("code")
        public String code = "";

        @C09CT("symbol")
        public String symbol = "";

        @C09CT("amount")
        public String amount = "";
    }

    public static final class GetTotalBalanceData {

        @C09CT("balance")
        public BalanceInfo balance;

        @C09CT("has_income_before")
        public boolean hasIncomeBefore;
    }
}
