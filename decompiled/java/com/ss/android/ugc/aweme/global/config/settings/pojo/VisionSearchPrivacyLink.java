package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes13.dex */
public class VisionSearchPrivacyLink {

    @C09CT("link_text")
    public String linkText;

    @C09CT("link_url")
    public String linkUrl;

    public String getLinkText() throws C316660CbA {
        String str = this.linkText;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getLinkUrl() throws C316660CbA {
        String str = this.linkUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
