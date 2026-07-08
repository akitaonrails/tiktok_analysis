package com.ss.android.ugc.aweme.ecommerce.anchor.showcase.models;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class PackedShop implements Serializable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("group_id")
    public final String groupId;

    @C09CT("group_type")
    public final String groupType;

    @C09CT("seller_id")
    public final String sellerId;

    public PackedShop() {
        this(null, null, null, null);
    }

    public PackedShop(String str, String str2, String str3, String str4) {
        this.sellerId = str;
        this.groupId = str2;
        this.groupType = str3;
        this.daInfo = str4;
    }
}
