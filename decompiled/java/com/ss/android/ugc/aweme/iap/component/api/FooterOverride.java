package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class FooterOverride {

    @C09CT("extra_actions")
    public final List<Object> extraActions;

    @C09CT("primary_button")
    public final PGCButton primaryButton;

    @C09CT("secondary_button")
    public final PGCButton secondaryButton;

    public FooterOverride() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FooterOverride)) {
            return false;
        }
        FooterOverride footerOverride = (FooterOverride) obj;
        return Intrinsics.LJFF(this.primaryButton, footerOverride.primaryButton) && Intrinsics.LJFF(this.secondaryButton, footerOverride.secondaryButton) && Intrinsics.LJFF(this.extraActions, footerOverride.extraActions);
    }

    public final int hashCode() {
        PGCButton pGCButton = this.primaryButton;
        int iHashCode = (pGCButton == null ? 0 : pGCButton.hashCode()) * 31;
        PGCButton pGCButton2 = this.secondaryButton;
        return ((iHashCode + (pGCButton2 != null ? pGCButton2.hashCode() : 0)) * 31) + this.extraActions.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FooterOverride(primaryButton=");
        sbLIZ.append(this.primaryButton);
        sbLIZ.append(", secondaryButton=");
        sbLIZ.append(this.secondaryButton);
        sbLIZ.append(", extraActions=");
        sbLIZ.append(this.extraActions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FooterOverride(PGCButton pGCButton, PGCButton pGCButton2, List<Object> list) {
        this.primaryButton = pGCButton;
        this.secondaryButton = pGCButton2;
        this.extraActions = list;
    }

    public FooterOverride(PGCButton pGCButton, PGCButton pGCButton2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pGCButton, (i & 2) != 0 ? null : pGCButton2, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
