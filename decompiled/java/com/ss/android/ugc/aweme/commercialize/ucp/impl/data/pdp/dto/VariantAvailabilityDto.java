package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VariantAvailabilityDto implements Serializable {

    @C09CT("available")
    public final Boolean available;

    public VariantAvailabilityDto() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VariantAvailabilityDto) && Intrinsics.LJFF(this.available, ((VariantAvailabilityDto) obj).available);
    }

    public int hashCode() {
        Boolean bool = this.available;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VariantAvailabilityDto(available=");
        sbLIZ.append(this.available);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VariantAvailabilityDto(Boolean bool) {
        this.available = bool;
    }
}
