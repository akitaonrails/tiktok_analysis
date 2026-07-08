package tikcast.api.eco;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SubmitRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("detector_user_id")
    public long detectorUserId;

    @C09CT("report_time")
    public long reportTime;

    @C09CT("room_id")
    public long roomId;

    @C09CT("screenshot_url")
    public String screenshotUrl = "";

    @C09CT("answers")
    public List<Answer> answers = new ArrayList();
}
