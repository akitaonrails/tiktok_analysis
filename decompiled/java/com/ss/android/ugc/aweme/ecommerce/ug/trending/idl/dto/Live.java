package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class Live implements Serializable {

    @C09CT("aweme_struct")
    public final String awemeStruct;

    @C09CT("like_count")
    public final Long likeCount;

    @C09CT("number")
    public final Long number;

    @C09CT("product_v3_list")
    public final List<WesternProduct> productV3;

    public Live() {
        this(null, null, null, null, 15, null);
    }

    public Live(String str, List<WesternProduct> list, Long l, Long l2) {
        this.awemeStruct = str;
        this.productV3 = list;
        this.likeCount = l;
        this.number = l2;
    }

    public Live(String str, List list, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2);
    }
}
