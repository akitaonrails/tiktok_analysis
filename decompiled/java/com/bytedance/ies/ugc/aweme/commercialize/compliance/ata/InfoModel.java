package com.bytedance.ies.ugc.aweme.commercialize.compliance.ata;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class InfoModel extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("country")
    public final String countryText;

    @C09CT("funding_party")
    public final FundingParty fundingParty;

    @C09CT("geo")
    public final String geoText;

    @C09CT("show_customer_audience")
    public final Boolean showCustomerAudience;

    @C09CT("show_lookalike_audience")
    public final Boolean showLookalikeAudience;

    public InfoModel() {
        this(null, null, Boolean.FALSE, Boolean.FALSE, null);
    }

    public final String getCountryText() {
        return this.countryText;
    }

    public final FundingParty getFundingParty() {
        return this.fundingParty;
    }

    public final String getGeoText() {
        return this.geoText;
    }

    public final Boolean getShowCustomerAudience() {
        return this.showCustomerAudience;
    }

    public final Boolean getShowLookalikeAudience() {
        return this.showLookalikeAudience;
    }

    public InfoModel(String str, String str2, Boolean bool, Boolean bool2, FundingParty fundingParty) {
        this.geoText = str;
        this.countryText = str2;
        this.showLookalikeAudience = bool;
        this.showCustomerAudience = bool2;
        this.fundingParty = fundingParty;
    }
}
