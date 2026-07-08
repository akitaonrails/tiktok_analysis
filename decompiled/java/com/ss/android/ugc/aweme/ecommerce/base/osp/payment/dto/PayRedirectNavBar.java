package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PayRedirectNavBar {

    @C09CT("dark_icon_url")
    public String darkIconUrl;

    @C09CT("light_icon_url")
    public String lightIconUrl;

    public PayRedirectNavBar() {
        this(null, null);
    }

    public PayRedirectNavBar(String str, String str2) {
        this.lightIconUrl = str;
        this.darkIconUrl = str2;
    }
}
