package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.tabbar;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class FixedItemOnboardingStyle {

    @C09CT("icon_text_spacing")
    public Float iconTextSpacing;

    @C09CT("shining")
    public FixedItemOnboardingShiningStyle shining;

    @C09CT("text_item")
    public FixedItemOnboardingTextStyle textItem;

    public FixedItemOnboardingStyle() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedItemOnboardingStyle)) {
            return false;
        }
        FixedItemOnboardingStyle fixedItemOnboardingStyle = (FixedItemOnboardingStyle) obj;
        return Intrinsics.LJFF(this.iconTextSpacing, fixedItemOnboardingStyle.iconTextSpacing) && Intrinsics.LJFF(this.textItem, fixedItemOnboardingStyle.textItem) && Intrinsics.LJFF(this.shining, fixedItemOnboardingStyle.shining);
    }

    public final int hashCode() {
        Float f = this.iconTextSpacing;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        FixedItemOnboardingTextStyle fixedItemOnboardingTextStyle = this.textItem;
        int iHashCode2 = (iHashCode + (fixedItemOnboardingTextStyle == null ? 0 : fixedItemOnboardingTextStyle.hashCode())) * 31;
        FixedItemOnboardingShiningStyle fixedItemOnboardingShiningStyle = this.shining;
        return iHashCode2 + (fixedItemOnboardingShiningStyle != null ? fixedItemOnboardingShiningStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FixedItemOnboardingStyle(iconTextSpacing=");
        sbLIZ.append(this.iconTextSpacing);
        sbLIZ.append(", textItem=");
        sbLIZ.append(this.textItem);
        sbLIZ.append(", shining=");
        sbLIZ.append(this.shining);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FixedItemOnboardingStyle(Float f, FixedItemOnboardingTextStyle fixedItemOnboardingTextStyle, FixedItemOnboardingShiningStyle fixedItemOnboardingShiningStyle) {
        this.iconTextSpacing = f;
        this.textItem = fixedItemOnboardingTextStyle;
        this.shining = fixedItemOnboardingShiningStyle;
    }
}
