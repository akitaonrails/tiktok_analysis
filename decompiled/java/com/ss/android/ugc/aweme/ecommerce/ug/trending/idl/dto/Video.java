package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class Video implements Serializable {

    @C09CT("aweme_struct")
    public final String awemeStruct;

    @C09CT("product_v3_list")
    public final List<WesternProduct> productV3;

    public Video() {
        this(null, null, 3, null);
    }

    public Video(String str, List<WesternProduct> list) {
        this.awemeStruct = str;
        this.productV3 = list;
    }

    public Video(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
