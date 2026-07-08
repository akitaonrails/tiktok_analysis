package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class RedirectDetailsContentBody {

    @C09CT("cookie_data")
    public String cookieData;

    @C09CT("redirect_details")
    public String redirectDetails;

    public RedirectDetailsContentBody() {
        this(null, null);
    }

    public RedirectDetailsContentBody(String str, String str2) {
        this.cookieData = str;
        this.redirectDetails = str2;
    }
}
