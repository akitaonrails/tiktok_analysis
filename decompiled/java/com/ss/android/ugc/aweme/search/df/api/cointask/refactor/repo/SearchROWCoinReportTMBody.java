package com.ss.android.ugc.aweme.search.df.api.cointask.refactor.repo;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SearchROWCoinReportTMBody implements Serializable {

    @C09CT("process_condition")
    public final Integer condition;

    @C09CT("gameplay_type")
    public final String gamePlayType;

    @C09CT("task_done_request")
    public final SearchROWCoinTaskDoneTMExtra taskDoneRequest;

    @C09CT("task_key")
    public final String taskKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchROWCoinReportTMBody)) {
            return false;
        }
        SearchROWCoinReportTMBody searchROWCoinReportTMBody = (SearchROWCoinReportTMBody) obj;
        return Intrinsics.LJFF(this.condition, searchROWCoinReportTMBody.condition) && Intrinsics.LJFF(this.taskKey, searchROWCoinReportTMBody.taskKey) && Intrinsics.LJFF(this.gamePlayType, searchROWCoinReportTMBody.gamePlayType) && Intrinsics.LJFF(this.taskDoneRequest, searchROWCoinReportTMBody.taskDoneRequest);
    }

    public int hashCode() {
        Integer num = this.condition;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.taskKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.gamePlayType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SearchROWCoinTaskDoneTMExtra searchROWCoinTaskDoneTMExtra = this.taskDoneRequest;
        return iHashCode3 + (searchROWCoinTaskDoneTMExtra != null ? searchROWCoinTaskDoneTMExtra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchROWCoinReportTMBody(condition=");
        sbLIZ.append(this.condition);
        sbLIZ.append(", taskKey=");
        sbLIZ.append(this.taskKey);
        sbLIZ.append(", gamePlayType=");
        sbLIZ.append(this.gamePlayType);
        sbLIZ.append(", taskDoneRequest=");
        sbLIZ.append(this.taskDoneRequest);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchROWCoinReportTMBody(Integer num, String str, String str2, SearchROWCoinTaskDoneTMExtra searchROWCoinTaskDoneTMExtra) {
        this.condition = num;
        this.taskKey = str;
        this.gamePlayType = str2;
        this.taskDoneRequest = searchROWCoinTaskDoneTMExtra;
    }
}
