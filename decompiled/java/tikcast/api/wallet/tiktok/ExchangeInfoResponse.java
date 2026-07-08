package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class ExchangeInfoResponse {

    @C09CT("data")
    public ExchangeInfoData data;

    public static final class ExchangeInfoData {

        @C09CT("auto_exchange_enable")
        public boolean autoExchangeEnable;

        @C09CT("auto_exchange_supported")
        public boolean autoExchangeSupported;

        @C09CT("auto_send")
        public boolean autoSend;

        @C09CT("exchange")
        public Exchange exchange;

        @C09CT("exchange_entrance_icon")
        public int exchangeEntranceIcon;

        @C09CT("exchange_entrance_subtitle")
        public int exchangeEntranceSubtitle;

        @C09CT("exchange_entrance_title")
        public int exchangeEntranceTitle;

        @C09CT("exchange_panel_hint")
        public int exchangePanelHint;

        @C09CT("is_first_exchange")
        public boolean isFirstExchange;

        @C09CT("w9_tax_status")
        public long w9TaxStatus;
    }
}
