package com.ss.android.ugc.aweme.subscription.pgc.api;

import X.C09CT;
import X.C13LP;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCSubscriptionProductDetail implements Serializable {
    public static final int $stable = 8;

    @C09CT("iap_client_param")
    public String iapClientParams;

    @C09CT("offer_id")
    public String offerId;

    @C09CT("offer_token")
    public String offerToken;

    @C09CT("price_phase_list")
    public List<PricePhase> pricePhaseList;

    @C09CT("sku_name")
    public String skuName;

    public PGCSubscriptionProductDetail() {
        this(null, null, null, null, null);
    }

    public final PricePhase getOfferPricePhase() {
        List<PricePhase> list;
        String str = this.offerId;
        boolean z = false;
        if (str != null && str.length() > 0) {
            z = true;
        }
        if (!z || (list = this.pricePhaseList) == null) {
            return null;
        }
        return (PricePhase) C13LP.LJJJLL(list);
    }

    public final PricePhase getOriginalPricePhase() {
        List<PricePhase> list = this.pricePhaseList;
        if (list != null) {
            return (PricePhase) C13LP.LJJLIIIJL(list);
        }
        return null;
    }

    public static final class PricePhase implements Serializable {
        public static final int $stable = 8;

        @C09CT("currency")
        public String currency;

        @C09CT("price")
        public String price;

        @C09CT("price_amount_micros")
        public final Long priceAmountMicros;

        public PricePhase() {
            this(null, null, null);
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getPrice() {
            return this.price;
        }

        public final Long getPriceAmountMicros() {
            return this.priceAmountMicros;
        }

        public final void setCurrency(String str) {
            this.currency = str;
        }

        public final void setPrice(String str) {
            this.price = str;
        }

        public PricePhase(String str, String str2, Long l) {
            this.currency = str;
            this.price = str2;
            this.priceAmountMicros = l;
        }
    }

    public final String getIapClientParams() {
        return this.iapClientParams;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final List<PricePhase> getPricePhaseList() {
        return this.pricePhaseList;
    }

    public final String getSkuName() {
        return this.skuName;
    }

    public final void setIapClientParams(String str) {
        this.iapClientParams = str;
    }

    public final void setOfferId(String str) {
        this.offerId = str;
    }

    public final void setOfferToken(String str) {
        this.offerToken = str;
    }

    public final void setPricePhaseList(List<PricePhase> list) {
        this.pricePhaseList = list;
    }

    public final void setSkuName(String str) {
        this.skuName = str;
    }

    public PGCSubscriptionProductDetail(String str, String str2, String str3, List<PricePhase> list, String str4) {
        this.skuName = str;
        this.offerId = str2;
        this.offerToken = str3;
        this.pricePhaseList = list;
        this.iapClientParams = str4;
    }
}
