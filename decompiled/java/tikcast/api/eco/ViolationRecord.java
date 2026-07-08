package tikcast.api.eco;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ViolationRecord {

    @C09CT("can_feedback")
    public boolean canFeedback;

    @C09CT("has_feedback")
    public boolean hasFeedback;

    @C09CT("live_info")
    public ViolationRecordLiveInfo liveInfo;

    @C09CT("punish_info")
    public ViolationRecordPunishInfo punishInfo;

    @C09CT("submitted_feedback_detail_id")
    public long submittedFeedbackDetailId;

    @C09CT("violation_id")
    public long violationId;

    @C09CT("violation_id_str")
    public String violationIdStr = "";

    @C09CT("custom_feedback_reason")
    public String customFeedbackReason = "";
}
