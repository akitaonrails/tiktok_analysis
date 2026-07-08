package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class RepostInfo implements Serializable {
    public transient Boolean passedRepostGuideCheck;

    @C09CT("reposters_cnt")
    public long repostersCnt;

    @C09CT("show_tag")
    public boolean showTag;

    @C09CT("reposters_token")
    public String repostersToken = "";

    @C09CT("first_others_note")
    public String firstOthersNote = "";

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{showTag=");
        sbLIZ.append(this.showTag);
        sbLIZ.append(",repostersToken=");
        sbLIZ.append(this.repostersToken);
        sbLIZ.append(",repostersCnt=");
        sbLIZ.append(this.repostersCnt);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
