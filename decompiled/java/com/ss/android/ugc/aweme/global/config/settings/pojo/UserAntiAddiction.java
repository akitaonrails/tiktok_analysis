package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class UserAntiAddiction {

    @C09CT("aweme_id")
    public String awemeId;

    @C09CT("popup_text")
    public String popupText;

    public String getAwemeId() throws C316660CbA {
        String str = this.awemeId;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }

    public String getPopupText() throws C316660CbA {
        String str = this.popupText;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
