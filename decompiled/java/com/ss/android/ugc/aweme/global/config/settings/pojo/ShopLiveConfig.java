package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import X.C316660CbA;

/* JADX INFO: loaded from: classes5.dex */
public class ShopLiveConfig {

    @C09CT("merch_picker_url")
    public String merchPickerUrl;

    public String getMerchPickerUrl() throws C316660CbA {
        String str = this.merchPickerUrl;
        if (str != null) {
            return str;
        }
        throw new C316660CbA();
    }
}
