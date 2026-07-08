package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GiftLimitGetResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("allow_custom_stall")
        public boolean allowCustomStall;

        @C09CT("gift_prompt_stall")
        public GiftPromptStall giftPromptStall;

        @C09CT("in_user_gifting_addiction_expr")
        public boolean inUserGiftingAddictionExpr;

        @C09CT("notification_status")
        public int notificationStatus;

        @C09CT("set_failed_toast")
        public String setFailedToast;

        @C09CT("set_successfully_toast")
        public String setSuccessfullyToast;

        @C09CT("suggested_custom_stall_text")
        public String suggestedCustomStallText;

        public static final class GiftPromptStall {

            @C09CT("amount_stalls")
            public List<Integer> amountStalls;

            @C09CT("coin_exchange_rate")
            public double coinExchangeRate;

            @C09CT("currency_code")
            public String currencyCode;

            @C09CT("currency_symbol")
            public String currencySymbol;

            @C09CT("past_max_money")
            public Integer pastMaxMoney;

            @C09CT("region")
            public String region;

            @C09CT("selected_code")
            public String selectedCode = "";

            @C09CT("selected_stall")
            public Integer selectedStall;

            @C09CT("selected_stall_in_coin")
            public int selectedStallInCoin;

            @C09CT("suggested_stall_threshold")
            public Integer suggestedStallThreshold;

            @C09CT("use_coin_limit")
            public boolean useCoinLimit;

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                if (this.currencyCode != null) {
                    sb.append(", currency_code=");
                    sb.append(this.currencyCode);
                }
                List<Integer> list = this.amountStalls;
                if (list != null && !list.isEmpty()) {
                    sb.append(", amount_stalls=");
                    sb.append(this.amountStalls);
                }
                if (this.selectedStall != null) {
                    sb.append(", selected_stall=");
                    sb.append(this.selectedStall);
                }
                if (this.currencySymbol != null) {
                    sb.append(", currency_symbol=");
                    sb.append(this.currencySymbol);
                }
                if (this.region != null) {
                    sb.append(", region=");
                    sb.append(this.region);
                }
                sb.replace(0, 2, "GiftPromptStall{");
                sb.append('}');
                return sb.toString();
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", notification_status=");
            sb.append(this.notificationStatus);
            if (this.giftPromptStall != null) {
                sb.append(", gift_prompt_stall=");
                sb.append(this.giftPromptStall);
            }
            if (this.setSuccessfullyToast != null) {
                sb.append(", set_successfully_toast=");
                sb.append(this.setSuccessfullyToast);
            }
            if (this.setFailedToast != null) {
                sb.append(", set_failed_toast=");
                sb.append(this.setFailedToast);
            }
            sb.replace(0, 2, "Data{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "GiftLimitGetResponse{");
        sb.append('}');
        return sb.toString();
    }
}
