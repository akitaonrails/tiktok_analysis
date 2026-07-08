package com.ss.android.ugc.aweme.bulletin.db.modle;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinItemCursor {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("max_time")
    public final Long maxTime;

    @C09CT("min_time")
    public final Long minTime;

    @C09CT("page_num")
    public final int pageNum;

    @C09CT("page_size")
    public final int pageSize;

    public BulletinItemCursor() {
        this(null, null, true, 0, 20);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinItemCursor(maxTime=");
        sbLIZ.append(this.maxTime);
        sbLIZ.append(", minTime=");
        sbLIZ.append(this.minTime);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", pageNum=");
        sbLIZ.append(this.pageNum);
        sbLIZ.append(", pageSize=");
        sbLIZ.append(this.pageSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinItemCursor(Long l, Long l2, boolean z, int i, int i2) {
        this.maxTime = l;
        this.minTime = l2;
        this.hasMore = z;
        this.pageNum = i;
        this.pageSize = i2;
    }
}
