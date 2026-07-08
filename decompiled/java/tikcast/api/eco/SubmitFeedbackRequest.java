package tikcast.api.eco;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class SubmitFeedbackRequest {

    @C09CT("feedback_detail_id")
    public long feedbackDetailId;

    @C09CT("feedback_type")
    public int feedbackType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("punish_record_id")
    public long punishRecordId;

    @C09CT("submit_feedback_scene")
    public int submitFeedbackScene;

    @C09CT("violation_id")
    public long violationId;

    @C09CT("feedback_detail_id_list")
    public List<Long> feedbackDetailIdList = new ArrayList();

    @C09CT("reason")
    public String reason = "";

    @C09CT("custom_reason")
    public String customReason = "";
}
