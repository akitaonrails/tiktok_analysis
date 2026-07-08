package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class ECMixMallGradientColor {

    @C09CT("absolute_positions")
    public List<Float> absolutePositions;

    @C09CT("angle")
    public int angle;

    @C09CT("colors")
    public List<String> colors;

    @C09CT("positions")
    public List<Float> positions;

    public ECMixMallGradientColor() {
        this(0, null, null, null, 15, null);
    }

    public ECMixMallGradientColor(int i, List<String> list, List<Float> list2, List<Float> list3) {
        this.angle = i;
        this.colors = list;
        this.positions = list2;
        this.absolutePositions = list3;
    }

    public ECMixMallGradientColor(int i, List list, List list2, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2, (i2 & 8) != 0 ? null : list3);
    }
}
