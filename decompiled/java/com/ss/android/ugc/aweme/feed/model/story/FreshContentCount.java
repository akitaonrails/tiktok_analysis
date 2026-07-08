package com.ss.android.ugc.aweme.feed.model.story;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class FreshContentCount implements Serializable {

    @C09CT("count")
    public long count;

    @C09CT("post_type")
    public int postType;

    public FreshContentCount() {
        this(1, 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreshContentCount)) {
            return false;
        }
        FreshContentCount freshContentCount = (FreshContentCount) obj;
        return this.postType == freshContentCount.postType && this.count == freshContentCount.count;
    }

    public int hashCode() {
        return (this.postType * 31) + C786410Ut5.Y2(this.count);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FreshContentCount(postType=");
        sbLIZ.append(this.postType);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FreshContentCount(int i, long j) {
        this.postType = i;
        this.count = j;
    }
}
