package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchInfo implements Serializable {

    @C09CT("ref_video_summary")
    public final String refVideoSummary;

    @C09CT("search_outreach_data")
    public final SearchOutreachDataStruct searchOutreachDataStruct;

    public SearchInfo() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchInfo(refVideoSummary=");
        sbLIZ.append(this.refVideoSummary);
        sbLIZ.append(", searchOutreachDataStruct=");
        sbLIZ.append(this.searchOutreachDataStruct);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchInfo(String str, SearchOutreachDataStruct searchOutreachDataStruct) {
        this.refVideoSummary = str;
        this.searchOutreachDataStruct = searchOutreachDataStruct;
    }
}
