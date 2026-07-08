package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class StandardInfo implements Serializable {

    @C09CT("change_plan_text")
    public final String changePlanText;

    @C09CT("offer_info")
    public final OfferInfo offerInfo;

    public StandardInfo() {
        this("", null);
    }

    public StandardInfo(String str, OfferInfo offerInfo) {
        this.changePlanText = str;
        this.offerInfo = offerInfo;
    }
}
