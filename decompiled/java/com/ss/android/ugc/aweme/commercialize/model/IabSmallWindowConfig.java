package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class IabSmallWindowConfig implements Serializable {

    @C09CT("small_window_position")
    public final Integer smallWindowPosition;

    public IabSmallWindowConfig() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IabSmallWindowConfig) && Intrinsics.LJFF(this.smallWindowPosition, ((IabSmallWindowConfig) obj).smallWindowPosition);
    }

    public int hashCode() {
        Integer num = this.smallWindowPosition;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IabSmallWindowConfig(smallWindowPosition=");
        sbLIZ.append(this.smallWindowPosition);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IabSmallWindowConfig(Integer num) {
        this.smallWindowPosition = num;
    }
}
