package com.ss.android.ugc.aweme.iap.component.api;

import X.AnonymousClass0081;
import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PromotionBadge {

    @C09CT("icon")
    public final AnonymousClass0081 icon;

    @C09CT("label")
    public final String label;

    public PromotionBadge() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionBadge)) {
            return false;
        }
        PromotionBadge promotionBadge = (PromotionBadge) obj;
        return Intrinsics.LJFF(this.label, promotionBadge.label) && this.icon == promotionBadge.icon;
    }

    public final int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AnonymousClass0081 anonymousClass0081 = this.icon;
        return iHashCode + (anonymousClass0081 != null ? anonymousClass0081.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PromotionBadge(label=");
        sbLIZ.append(this.label);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PromotionBadge(String str, AnonymousClass0081 anonymousClass0081) {
        this.label = str;
        this.icon = anonymousClass0081;
    }
}
