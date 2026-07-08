package com.ss.android.ugc.aweme.minis.feed.fsb;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes19.dex */
public final class FeedSideBarMinisLynxParams {

    @C09CT("col")
    public final int col;

    @C09CT("height")
    public final int height;

    @C09CT("row")
    public final int row;

    @C09CT("width")
    public final int width;

    public FeedSideBarMinisLynxParams() {
        this(0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedSideBarMinisLynxParams)) {
            return false;
        }
        FeedSideBarMinisLynxParams feedSideBarMinisLynxParams = (FeedSideBarMinisLynxParams) obj;
        return this.row == feedSideBarMinisLynxParams.row && this.col == feedSideBarMinisLynxParams.col && this.width == feedSideBarMinisLynxParams.width && this.height == feedSideBarMinisLynxParams.height;
    }

    public final int hashCode() {
        return (((((this.row * 31) + this.col) * 31) + this.width) * 31) + this.height;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedSideBarMinisLynxParams(row=");
        sbLIZ.append(this.row);
        sbLIZ.append(", col=");
        sbLIZ.append(this.col);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedSideBarMinisLynxParams(int i, int i2, int i3, int i4) {
        this.row = i;
        this.col = i2;
        this.width = i3;
        this.height = i4;
    }
}
