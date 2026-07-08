package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ReviewInteractPicsDto {

    @C09CT("image")
    public final List<String> image;

    public ReviewInteractPicsDto() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReviewInteractPicsDto) && Intrinsics.LJFF(this.image, ((ReviewInteractPicsDto) obj).image);
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
        sbLIZ.append("ReviewInteractPicsDto(image=");
        sbLIZ.append(this.image);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReviewInteractPicsDto(List<String> list) {
        this.image = list;
    }
}
