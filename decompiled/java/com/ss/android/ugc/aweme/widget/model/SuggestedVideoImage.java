package com.ss.android.ugc.aweme.widget.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SuggestedVideoImage {

    @C09CT("url")
    public final String url;

    public SuggestedVideoImage() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuggestedVideoImage) && Intrinsics.LJFF(this.url, ((SuggestedVideoImage) obj).url);
    }

    public int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedVideoImage(url=");
        sbLIZ.append(this.url);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SuggestedVideoImage(String str) {
        this.url = str;
    }
}
