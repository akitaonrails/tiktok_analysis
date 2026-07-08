package com.ss.android.ugc.aweme.ecommerce.ug.common.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes27.dex */
public final class DiversionImage {

    @C09CT("dark")
    public final String darkUrl;

    @C09CT("height")
    public final Integer height;

    @C09CT("light")
    public final String lightUrl;

    @C09CT("type")
    public final Integer type;

    @C09CT("width")
    public final Integer width;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiversionImage(lightUrl=");
        sbLIZ.append(this.lightUrl);
        sbLIZ.append(", darkUrl=");
        sbLIZ.append(this.darkUrl);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DiversionImage(String str, String str2, Integer num, Integer num2, Integer num3) {
        this.lightUrl = str;
        this.darkUrl = str2;
        this.width = num;
        this.height = num2;
        this.type = num3;
    }
}
