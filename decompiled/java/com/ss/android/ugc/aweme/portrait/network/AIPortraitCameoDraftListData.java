package com.ss.android.ugc.aweme.portrait.network;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AIPortraitCameoDraftListData {

    @C09CT("cursor")
    public final long cursor;

    @C09CT("draft_list")
    public final List<CameoDraft> draftList;

    @C09CT("has_more")
    public final boolean hasMore;

    public AIPortraitCameoDraftListData() {
        this(null, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitCameoDraftListData)) {
            return false;
        }
        AIPortraitCameoDraftListData aIPortraitCameoDraftListData = (AIPortraitCameoDraftListData) obj;
        return Intrinsics.LJFF(this.draftList, aIPortraitCameoDraftListData.draftList) && this.cursor == aIPortraitCameoDraftListData.cursor && this.hasMore == aIPortraitCameoDraftListData.hasMore;
    }

    public final int hashCode() {
        List<CameoDraft> list = this.draftList;
        return ((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Y2(this.cursor)) * 31) + C786410Ut5.Z2(this.hasMore);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitCameoDraftListData(draftList=");
        sbLIZ.append(this.draftList);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIPortraitCameoDraftListData(List<CameoDraft> list, long j, boolean z) {
        this.draftList = list;
        this.cursor = j;
        this.hasMore = z;
    }
}
