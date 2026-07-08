package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class ReferenceVideoItemBridge implements Serializable {

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("cover_url_list")
    public final List<String> coverUrlList;

    @C09CT("digg_count")
    public final long diggCount;

    public ReferenceVideoItemBridge() {
        this(null, 0L, null, 7, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReferenceVideoItemBridge(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", diggCount=");
        sbLIZ.append(this.diggCount);
        sbLIZ.append(", coverUrlList=");
        sbLIZ.append(this.coverUrlList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ReferenceVideoItemBridge(String str, long j, List<String> list) {
        this.awemeId = str;
        this.diggCount = j;
        this.coverUrlList = list;
    }

    public ReferenceVideoItemBridge(String str, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
