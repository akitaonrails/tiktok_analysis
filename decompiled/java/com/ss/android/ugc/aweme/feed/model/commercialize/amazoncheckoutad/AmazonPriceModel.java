package com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AmazonPriceModel implements Serializable {

    @C09CT("currencyCode")
    public final String currencyCode;

    @C09CT("displayValue")
    public final String displayValue;

    @C09CT("shouldHidePrice")
    public final boolean shouldHidePrice;

    @C09CT("value")
    public final double value;

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getDisplayValue() {
        return this.displayValue;
    }

    public final boolean getShouldHidePrice() {
        return this.shouldHidePrice;
    }

    public final double getValue() {
        return this.value;
    }
}
