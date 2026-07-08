package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.components.icon;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class IconComponentData {

    @C09CT("icon")
    public final Icon icon;

    public IconComponentData() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IconComponentData) && Intrinsics.LJFF(this.icon, ((IconComponentData) obj).icon);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        if (icon == null) {
            return 0;
        }
        return icon.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconComponentData(icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IconComponentData(Icon icon) {
        this.icon = icon;
    }
}
