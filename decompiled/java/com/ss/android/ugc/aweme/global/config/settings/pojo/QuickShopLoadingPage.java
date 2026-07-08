package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class QuickShopLoadingPage {

    @C09CT("background_url")
    public String backgroundUrl;

    @C09CT("text_pic_url")
    public String textPicUrl;

    public String getBackgroundUrl() throws C316660CbA {
        String str = this.backgroundUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getTextPicUrl() throws C316660CbA {
        String str = this.textPicUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
