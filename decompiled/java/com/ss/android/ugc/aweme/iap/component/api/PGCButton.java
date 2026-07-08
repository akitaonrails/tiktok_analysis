package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PGCButton {

    @C09CT("action")
    public final ActionDescriptor action;

    @C09CT("description")
    public final String description;

    @C09CT("label")
    public final String label;

    public PGCButton() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PGCButton)) {
            return false;
        }
        PGCButton pGCButton = (PGCButton) obj;
        return Intrinsics.LJFF(this.label, pGCButton.label) && Intrinsics.LJFF(this.description, pGCButton.description) && Intrinsics.LJFF(this.action, pGCButton.action);
    }

    public final int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ActionDescriptor actionDescriptor = this.action;
        return iHashCode2 + (actionDescriptor != null ? actionDescriptor.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PGCButton(label=");
        sbLIZ.append(this.label);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PGCButton(String str, String str2, ActionDescriptor actionDescriptor) {
        this.label = str;
        this.description = str2;
        this.action = actionDescriptor;
    }
}
