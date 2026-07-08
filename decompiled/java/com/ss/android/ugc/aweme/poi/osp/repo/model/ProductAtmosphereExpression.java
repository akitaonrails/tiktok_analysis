package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductAtmosphereExpression {

    @C09CT("atmosphere_type")
    public final Integer atmosphereType;

    @C09CT("logos")
    public final List<LogoModel> logos;

    @C09CT("sales_volume")
    public final Integer salesVolume;

    @C09CT("text")
    public final String text;

    public ProductAtmosphereExpression() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductAtmosphereExpression)) {
            return false;
        }
        ProductAtmosphereExpression productAtmosphereExpression = (ProductAtmosphereExpression) obj;
        return Intrinsics.LJFF(this.atmosphereType, productAtmosphereExpression.atmosphereType) && Intrinsics.LJFF(this.text, productAtmosphereExpression.text) && Intrinsics.LJFF(this.salesVolume, productAtmosphereExpression.salesVolume) && Intrinsics.LJFF(this.logos, productAtmosphereExpression.logos);
    }

    public ProductAtmosphereExpression(Integer num, String str, Integer num2, List<LogoModel> list) {
        this.atmosphereType = num;
        this.text = str;
        this.salesVolume = num2;
        this.logos = list;
    }
}
