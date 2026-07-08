package com.bytedance.touchpoint.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TaskEventResponse {

    @C09CT("display_info")
    public DisplayInfo displayInfo;

    @C09CT("progress_info")
    public ProgressInfo progressInfo;

    @C09CT("report_instruction")
    public ReportInstruction reportInstruction;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Status status;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("touch_points")
    public final List<TouchPoint> touchPoints;

    public TaskEventResponse() {
        this(0, "", null, null, null, null, new ArrayList());
    }

    public TaskEventResponse(int i, String str, ReportInstruction reportInstruction, Status status, ProgressInfo progressInfo, DisplayInfo displayInfo, List<TouchPoint> list) {
        this.statusCode = i;
        this.statusMsg = str;
        this.reportInstruction = reportInstruction;
        this.status = status;
        this.progressInfo = progressInfo;
        this.displayInfo = displayInfo;
        this.touchPoints = list;
    }
}
