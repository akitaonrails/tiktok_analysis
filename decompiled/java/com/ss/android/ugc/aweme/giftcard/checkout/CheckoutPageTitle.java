package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CheckoutPageTitle {

    @C09CT("security_sub_title")
    public final String securitySubTitle;

    @C09CT("security_sub_title_url")
    public final String securitySubTitleUrl;

    @C09CT("select_notify_method_title")
    public final String selectNotifyMethodTitle;

    @C09CT("title_content")
    public final String titleContent;

    public CheckoutPageTitle() {
        this(null, null, null, null);
    }

    public CheckoutPageTitle(String str, String str2, String str3, String str4) {
        this.titleContent = str;
        this.securitySubTitle = str2;
        this.securitySubTitleUrl = str3;
        this.selectNotifyMethodTitle = str4;
    }
}
