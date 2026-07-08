package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class GetFypAffiliateInfoResponse implements Serializable {

    @C09CT("ab_test_param")
    public final String abTestParam;

    @C09CT("fyp_cta_button")
    public final FypCtaButton fypCtaButton;

    @C09CT("fyp_sub_button")
    public final FypCtaButton fypSubButton;

    @C09CT("meta_info")
    public final FypAffiliateMeta metaInfo;

    public GetFypAffiliateInfoResponse() {
        this(null, null, null, null);
    }

    public GetFypAffiliateInfoResponse(FypCtaButton fypCtaButton, FypCtaButton fypCtaButton2, FypAffiliateMeta fypAffiliateMeta, String str) {
        this.fypCtaButton = fypCtaButton;
        this.fypSubButton = fypCtaButton2;
        this.metaInfo = fypAffiliateMeta;
        this.abTestParam = str;
    }
}
