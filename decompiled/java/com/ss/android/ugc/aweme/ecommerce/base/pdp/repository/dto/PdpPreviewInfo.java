package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C01GW;
import X.C09CT;
import X.C0C64;
import X.C13BV;
import X.C1759110vsT;
import X.C997103v7;
import X.EnumC10415045l;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpPreviewInfo {

    @C09CT("cover")
    public String cover;

    @C09CT("cover_index")
    public final int coverIndex;

    @C09CT("discount")
    public final String discount;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_price_hidden")
    public final boolean isPriceHidden;

    @C09CT("origin_price")
    public final String originPrice;

    @C09CT("price")
    public final String price;

    @C09CT("title")
    public final String title;

    public final ProductPrice LIZ() {
        C01GW c01gw = C997103v7.LIZ;
        return new ProductPrice(((Boolean) c01gw.getValue()).booleanValue() ? this.originPrice : null, (Intrinsics.LJFF(this.price, "null") || C0C64.LJIILLIIL().LJIJ(31744, 0, "ecom_pdp_new_price_style", true) > 0) ? null : this.price, null, ((Boolean) c01gw.getValue()).booleanValue() ? this.discount : null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final ProductPackStruct LIZIZ(int i, int i2) {
        List listSingletonList;
        String str = this.title;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        String strLIZIZ = C1759110vsT.LIZIZ(this.cover);
        String str2 = this.cover;
        if (str2 == null || (listSingletonList = Collections.singletonList(str2)) == null) {
            listSingletonList = C13BV.INSTANCE;
        }
        ProductPackStruct productPackStruct = new ProductPackStruct(this.id, null, null, null, new ProductBase(str, null, null, null, Collections.singletonList(new Image(numValueOf, numValueOf2, null, strLIZIZ, listSingletonList, null, null, null, null, null, null, null, null)), null, null, null, LIZ(), null, Integer.valueOf(EnumC10415045l.ONE_TIME_PURCHASE.getValue()), null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        productPackStruct.dataType = 0;
        return productPackStruct;
    }

    public PdpPreviewInfo(String str, String str2, String str3, String str4, int i, boolean z, String str5, String str6) {
        this.title = str;
        this.price = str2;
        this.cover = str3;
        this.id = str4;
        this.coverIndex = i;
        this.isPriceHidden = z;
        this.originPrice = str5;
        this.discount = str6;
    }
}
