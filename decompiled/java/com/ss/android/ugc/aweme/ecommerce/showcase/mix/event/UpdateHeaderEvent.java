package com.ss.android.ugc.aweme.ecommerce.showcase.mix.event;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class UpdateHeaderEvent extends BaseMixEvent {

    @C09CT("height")
    public final Float height;

    @C09CT("stickyHeight")
    public final Float stickyHeight;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateHeaderEvent)) {
            return false;
        }
        UpdateHeaderEvent updateHeaderEvent = (UpdateHeaderEvent) obj;
        return Intrinsics.LJFF(this.stickyHeight, updateHeaderEvent.stickyHeight) && Intrinsics.LJFF(this.height, updateHeaderEvent.height);
    }

    public final int hashCode() {
        Float f = this.stickyHeight;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.height;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateHeaderEvent(stickyHeight=");
        sbLIZ.append(this.stickyHeight);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UpdateHeaderEvent(Float f, Float f2) {
        this.stickyHeight = f;
        this.height = f2;
    }
}
