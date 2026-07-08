package com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class FypCtaButton implements Serializable {

    @C09CT("after_click_text")
    public final String afterClickText;

    @C09CT("click_action")
    public final Integer clickAction;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("link_url")
    public final String linkUrl;

    @C09CT("text")
    public final String text;

    public FypCtaButton() {
        this(null, null, null, null, null);
    }

    public FypCtaButton(String str, Integer num, String str2, String str3, String str4) {
        this.text = str;
        this.clickAction = num;
        this.linkUrl = str2;
        this.afterClickText = str3;
        this.daInfo = str4;
    }
}
