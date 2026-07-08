package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoStandardRatio {

    @C09CT("height")
    public final int height;

    @C09CT("name_text")
    public final String nameText;

    @C09CT("std_size")
    public final int stdSize;

    @C09CT("width")
    public final int width;

    public TakoStandardRatio() {
        this(0, 0, 0, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoStandardRatio)) {
            return false;
        }
        TakoStandardRatio takoStandardRatio = (TakoStandardRatio) obj;
        return this.width == takoStandardRatio.width && this.height == takoStandardRatio.height && this.stdSize == takoStandardRatio.stdSize && Intrinsics.LJFF(this.nameText, takoStandardRatio.nameText);
    }

    public final int hashCode() {
        return (((((this.width * 31) + this.height) * 31) + this.stdSize) * 31) + this.nameText.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.width);
        sbLIZ.append(':');
        sbLIZ.append(this.height);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoStandardRatio(int i, int i2, int i3, String str) {
        this.width = i;
        this.height = i2;
        this.stdSize = i3;
        this.nameText = str;
    }
}
