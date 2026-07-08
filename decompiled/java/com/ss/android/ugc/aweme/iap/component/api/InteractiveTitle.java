package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class InteractiveTitle {

    @C09CT("action")
    public final ActionDescriptor action;

    @C09CT("label")
    public final String label;

    public InteractiveTitle() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractiveTitle)) {
            return false;
        }
        InteractiveTitle interactiveTitle = (InteractiveTitle) obj;
        return Intrinsics.LJFF(this.label, interactiveTitle.label) && Intrinsics.LJFF(this.action, interactiveTitle.action);
    }

    public final int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ActionDescriptor actionDescriptor = this.action;
        return iHashCode + (actionDescriptor != null ? actionDescriptor.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractiveTitle(label=");
        sbLIZ.append(this.label);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InteractiveTitle(String str, ActionDescriptor actionDescriptor) {
        this.label = str;
        this.action = actionDescriptor;
    }
}
