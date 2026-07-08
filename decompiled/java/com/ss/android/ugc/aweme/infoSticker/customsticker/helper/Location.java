package com.ss.android.ugc.aweme.infoSticker.customsticker.helper;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes24.dex */
public final class Location {

    @C09CT("h")
    public final int height;

    @C09CT("x")
    public final int left;

    @C09CT("y")
    public final int top;

    @C09CT("w")
    public final int width;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.left);
        sbLIZ.append(", ");
        sbLIZ.append(this.top);
        sbLIZ.append("], width: ");
        sbLIZ.append(this.width);
        sbLIZ.append(", height: ");
        sbLIZ.append(this.height);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Location(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.width = i3;
        this.height = i4;
    }
}
