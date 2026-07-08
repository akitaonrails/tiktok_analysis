package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExitRetentionButton {

    @C09CT("label")
    public final String label;

    public ExitRetentionButton() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExitRetentionButton) && Intrinsics.LJFF(this.label, ((ExitRetentionButton) obj).label);
    }

    public final int hashCode() {
        String str = this.label;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitRetentionButton(label=");
        sbLIZ.append(this.label);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExitRetentionButton(String str) {
        this.label = str;
    }
}
