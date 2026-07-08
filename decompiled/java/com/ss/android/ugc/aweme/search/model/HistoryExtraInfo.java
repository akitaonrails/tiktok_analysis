package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes11.dex */
public final class HistoryExtraInfo {

    @C09CT("rich_his_info")
    public final RichHisInfo richHisInfo;

    @C09CT("word")
    public final String word;

    public HistoryExtraInfo() {
        this("", null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryExtraInfo(word=");
        sbLIZ.append(this.word);
        sbLIZ.append(", richHisInfo=");
        sbLIZ.append(this.richHisInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public HistoryExtraInfo(String str, RichHisInfo richHisInfo) {
        this.word = str;
        this.richHisInfo = richHisInfo;
    }
}
