package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;

/* JADX INFO: loaded from: classes.dex */
public final class BubbleIcon {

    @C09CT("icon_left")
    public final Icon iconLeft;

    @C09CT("icon_right")
    public final Icon iconRight;

    public BubbleIcon() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleIcon(iconLeft=");
        sbLIZ.append(this.iconLeft);
        sbLIZ.append(", iconRight=");
        sbLIZ.append(this.iconRight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BubbleIcon(Icon icon, Icon icon2) {
        this.iconLeft = icon;
        this.iconRight = icon2;
    }
}
