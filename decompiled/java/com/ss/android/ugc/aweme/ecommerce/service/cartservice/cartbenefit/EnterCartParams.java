package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class EnterCartParams {

    @C09CT("buyer_addr_id")
    public final String buyerAddrId;

    @C09CT("previous_page")
    public final String previousPage;

    @C09CT("source_btm_token")
    public final String sourceBtmToken;

    @C09CT("track_params")
    public final Map<String, Object> trackParams;

    public EnterCartParams() {
        this(null, null, null, null);
    }

    public EnterCartParams(String str, String str2, String str3, Map<String, ? extends Object> map) {
        this.buyerAddrId = str;
        this.sourceBtmToken = str2;
        this.previousPage = str3;
        this.trackParams = map;
    }
}
