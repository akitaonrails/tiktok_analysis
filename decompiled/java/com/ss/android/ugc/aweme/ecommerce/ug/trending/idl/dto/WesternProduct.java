package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class WesternProduct implements Serializable {

    @C09CT("bcm_standard_track")
    public final BcmStandardEvent bcmStandardTrack;

    @C09CT("images")
    public final List<Image> images;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("pdp_schema")
    public final String pdpSchema;

    @C09CT("product_id")
    public final String productId;

    public WesternProduct() {
        this(null, null, null, null, null, 31, null);
    }

    public WesternProduct(String str, List<Image> list, String str2, String str3, BcmStandardEvent bcmStandardEvent) {
        this.productId = str;
        this.images = list;
        this.pdpSchema = str2;
        this.logExtra = str3;
        this.bcmStandardTrack = bcmStandardEvent;
    }

    public WesternProduct(String str, List list, String str2, String str3, BcmStandardEvent bcmStandardEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? bcmStandardEvent : null);
    }
}
