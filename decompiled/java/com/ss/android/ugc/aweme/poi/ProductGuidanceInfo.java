package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ProductGuidanceInfo implements Serializable {

    @C09CT("shelf_button_text")
    public final String shelfButtonText;

    @C09CT("shelf_lynx_link")
    public final String shelfLynxLink;

    public ProductGuidanceInfo() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductGuidanceInfo(shelfButtonText=");
        sbLIZ.append(this.shelfButtonText);
        sbLIZ.append(", shelfLynxLink=");
        sbLIZ.append(this.shelfLynxLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductGuidanceInfo(String str, String str2) {
        this.shelfButtonText = str;
        this.shelfLynxLink = str2;
    }
}
