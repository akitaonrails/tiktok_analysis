package com.ss.android.ugc.aweme.search.ecommerce.entrance;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ECSearchResultBgColor implements Serializable {

    @C09CT("gradient_colors")
    public final String[] gradientColors;

    @C09CT("gradient_deg")
    public final Integer gradientDeg;

    @C09CT("gradient_positions")
    public final float[] gradientPositions;

    @C09CT("height")
    public final Integer height;

    @C09CT("color")
    public final String singleColor;

    @C09CT("type")
    public final String type;

    @C09CT("width")
    public final Integer width;

    public ECSearchResultBgColor(String str, String str2, Integer num, String[] strArr, float[] fArr, Integer num2, Integer num3) {
        this.type = str;
        this.singleColor = str2;
        this.gradientDeg = num;
        this.gradientColors = strArr;
        this.gradientPositions = fArr;
        this.height = num2;
        this.width = num3;
    }
}
