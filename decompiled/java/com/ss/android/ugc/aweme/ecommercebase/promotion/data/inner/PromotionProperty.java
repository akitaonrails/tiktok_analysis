package com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionProperty {

    @C09CT("property_name")
    public String propertyName;

    @C09CT("property_value")
    public String propertyValue;

    public PromotionProperty() {
        this(null, null);
    }

    public PromotionProperty(String str, String str2) {
        this.propertyName = str;
        this.propertyValue = str2;
    }
}
