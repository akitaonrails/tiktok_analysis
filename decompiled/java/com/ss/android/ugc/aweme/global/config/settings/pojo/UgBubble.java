package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes25.dex */
public class UgBubble {

    @C09CT("resource_url")
    public UrlModel resourceUrl;

    @C09CT("seconds")
    public Integer seconds;

    @C09CT("text")
    public String text;

    public UrlModel getResourceUrl() throws C316660CbA {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C316660CbA();
    }

    public Integer getSeconds() throws C316660CbA {
        Integer num = this.seconds;
        if (num != null) {
            return num;
        }
        throw new C316660CbA();
    }

    public String getText() throws C316660CbA {
        String str = this.text;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
