package tikcast.api.standingscore;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class TransactionRecord {

    @C09CT("education_task_completed_info")
    public EducationTaskCompletedInfo educationTaskCompletedInfo;

    @C09CT("effective_score")
    public double effectiveScore;

    @C09CT("event_time")
    public long eventTime;

    @C09CT("go_live_no_violation_info")
    public GoLiveNoViolationInfo goLiveNoViolationInfo;

    @C09CT("guideline_violation_info")
    public GuidelineViolationInfo guidelineViolationInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("record_type")
    public int recordType;

    @C09CT("successful_violation_appeal_info")
    public SuccessfulViolationAppealInfo successfulViolationAppealInfo;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_score")
    public double userScore;

    public static final class EducationTaskCompletedInfo {

        @C09CT("education_material_id")
        public int educationMaterialId;

        @C09CT("education_task_id")
        public long educationTaskId;
    }

    public static final class GoLiveNoViolationInfo {
    }

    public static final class GuidelineViolationInfo {

        @C09CT("education_material_id")
        public int educationMaterialId;

        @C09CT("education_task_id")
        public long educationTaskId;

        @C09CT("has_education_task")
        public boolean hasEducationTask;

        @C09CT("is_restored")
        public boolean isRestored;

        @C09CT("punish_record_id")
        public long punishRecordId;

        @C09CT("education_task_url")
        public String educationTaskUrl = "";

        @C09CT("punish_record_url")
        public String punishRecordUrl = "";
    }

    public static final class SuccessfulViolationAppealInfo {

        @C09CT("appeal_task_id")
        public long appealTaskId;

        @C09CT("punish_record_id")
        public long punishRecordId;

        @C09CT("punish_record_url")
        public String punishRecordUrl = "";
    }
}
