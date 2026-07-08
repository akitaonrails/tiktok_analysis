package com.ss.android.ugc.aweme.publicgroup.data;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewEntryMeta {

    @C09CT("text")
    public final String buttonText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreviewEntryMeta) && Intrinsics.LJFF(this.buttonText, ((PreviewEntryMeta) obj).buttonText);
    }

    public final int hashCode() {
        return this.buttonText.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewEntryMeta(buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreviewEntryMeta() {
        this("");
    }

    public PreviewEntryMeta(String str) {
        this.buttonText = str;
    }
}
