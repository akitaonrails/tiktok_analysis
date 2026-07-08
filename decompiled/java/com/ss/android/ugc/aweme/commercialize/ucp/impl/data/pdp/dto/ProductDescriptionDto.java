package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ProductDescriptionDto implements Serializable {

    @C09CT("html")
    public final String html;

    public ProductDescriptionDto() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductDescriptionDto) && Intrinsics.LJFF(this.html, ((ProductDescriptionDto) obj).html);
    }

    public int hashCode() {
        String str = this.html;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductDescriptionDto(html=");
        sbLIZ.append(this.html);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProductDescriptionDto(String str) {
        this.html = str;
    }
}
