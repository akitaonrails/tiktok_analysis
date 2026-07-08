package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import X.InterfaceC1294060jmO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1294060jmO
public final class ProductPrice implements Serializable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("discount")
    public final String discount;

    @C09CT("original_price")
    public final String originalPrice;

    @C09CT("price_prefix")
    public final String pricePrefix;

    @C09CT("real_price")
    public final String realPrice;

    public ProductPrice() {
        this(null, null, null, null, null);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getDaInfo$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getDiscount$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getOriginalPrice$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getPricePrefix$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getRealPrice$annotations() {
    }

    public ProductPrice(String str, String str2, String str3, String str4, String str5) {
        this.originalPrice = str;
        this.realPrice = str2;
        this.pricePrefix = str3;
        this.discount = str4;
        this.daInfo = str5;
    }
}
