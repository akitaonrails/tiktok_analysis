package com.ss.android.ugc.aweme.story.highlights.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StoryHighlightsCoverReportResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("report_task_id")
    public final String reportTaskId;

    public final StoryHighlightsCoverReportResponse copy(String str) {
        return new StoryHighlightsCoverReportResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryHighlightsCoverReportResponse) && Intrinsics.LJFF(this.reportTaskId, ((StoryHighlightsCoverReportResponse) obj).reportTaskId);
    }

    public int hashCode() {
        String str = this.reportTaskId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightsCoverReportResponse(reportTaskId=");
        sbLIZ.append(this.reportTaskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryHighlightsCoverReportResponse() {
        this("");
    }

    public final String getReportTaskId() {
        return this.reportTaskId;
    }

    public StoryHighlightsCoverReportResponse(String str) {
        this.reportTaskId = str;
    }
}
