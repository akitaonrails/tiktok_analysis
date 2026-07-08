package com.ss.android.ugc.aweme.comment.viewerlist.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewCountData implements Serializable {
    public static final int $stable = 0;

    @C09CT("cold_start_view_count")
    public final Long coldStartViewCount;

    @C09CT("is_milestone_view")
    public final Boolean isMilestoneView;

    public ViewCountData() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewCountData(coldStartViewCount=");
        sbLIZ.append(this.coldStartViewCount);
        sbLIZ.append(", isMilestoneView=");
        sbLIZ.append(this.isMilestoneView);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isMilestoneView() {
        return this.isMilestoneView;
    }

    public ViewCountData(Long l, Boolean bool) {
        this.coldStartViewCount = l;
        this.isMilestoneView = bool;
    }
}
