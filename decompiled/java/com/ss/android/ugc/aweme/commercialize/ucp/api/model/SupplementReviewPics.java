package com.ss.android.ugc.aweme.commercialize.ucp.api.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SupplementReviewPics implements Serializable {

    @C09CT("image")
    public final List<String> image;

    public SupplementReviewPics() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SupplementReviewPics) && Intrinsics.LJFF(this.image, ((SupplementReviewPics) obj).image);
    }

    public int hashCode() {
        List<String> list = this.image;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SupplementReviewPics(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SupplementReviewPics(List<String> list) {
        this.image = list;
    }
}
