package com.ss.android.ugc.aweme.poi.mapdetail.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class HotelShelfInfo implements Serializable {

    @C09CT("readable_discount")
    public final String readableDiscount;

    @C09CT("readable_shelf_min_price")
    public final String readableShelfMinPrice;

    @C09CT("readable_shelf_origin_price")
    public final String readableShelfOriginPrice;

    public HotelShelfInfo() {
        this(null, null, null);
    }

    public HotelShelfInfo(String str, String str2, String str3) {
        this.readableShelfMinPrice = str;
        this.readableShelfOriginPrice = str2;
        this.readableDiscount = str3;
    }
}
