package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class SellerInfo implements Serializable {

    @C09CT("name")
    public final String name;

    @C09CT("shop_icon")
    public final Icon shopIcon;

    public SellerInfo(String str, Icon icon) {
        this.name = str;
        this.shopIcon = icon;
    }
}
