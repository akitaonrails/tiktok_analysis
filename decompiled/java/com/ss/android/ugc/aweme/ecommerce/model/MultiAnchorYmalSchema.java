package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiAnchorYmalSchema {

    @C09CT("open_url")
    public final String openUrl;

    public MultiAnchorYmalSchema() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiAnchorYmalSchema) && Intrinsics.LJFF(this.openUrl, ((MultiAnchorYmalSchema) obj).openUrl);
    }

    public final int hashCode() {
        String str = this.openUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiAnchorYmalSchema(openUrl=");
        sbLIZ.append(this.openUrl);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MultiAnchorYmalSchema(String str) {
        this.openUrl = str;
    }
}
