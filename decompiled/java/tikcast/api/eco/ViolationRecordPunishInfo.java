package tikcast.api.eco;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ViolationRecordPunishInfo {

    @C09CT("appeal_info")
    public ViolationAppealInfo appealInfo;

    @C09CT("appeal_status")
    public int appealStatus;

    @C09CT("guide_link_can_feedback")
    public boolean guideLinkCanFeedback;

    @C09CT("guide_link_edu_id")
    public long guideLinkEduId;

    @C09CT("guide_link_has_feedback")
    public boolean guideLinkHasFeedback;

    @C09CT("icon_type")
    public int iconType;

    @C09CT("is_permanent_punish")
    public boolean isPermanentPunish;

    @C09CT("punish_end_time")
    public long punishEndTime;

    @C09CT("punish_end_time_type")
    public int punishEndTimeType;

    @C09CT("punish_expected_end_time")
    public long punishExpectedEndTime;

    @C09CT("punish_real_end_time")
    public long punishRealEndTime;

    @C09CT("punish_record_id")
    public long punishRecordId;

    @C09CT("punish_start_time")
    public long punishStartTime;

    @C09CT("punish_type_id")
    public int punishTypeId;

    @C09CT("subfeature_punish_info")
    public SubfeaturePunishInfo subfeaturePunishInfo;

    @C09CT("tns_punish_id")
    public long tnsPunishId;

    @C09CT("punish_title")
    public String punishTitle = "";

    @C09CT("punish_reason")
    public String punishReason = "";

    @C09CT("detail_url")
    public String detailUrl = "";

    @C09CT("guide_link_url")
    public String guideLinkUrl = "";

    @C09CT("moderation_info")
    public String moderationInfo = "";

    @C09CT("punish_record_id_str")
    public String punishRecordIdStr = "";

    @C09CT("violation_type")
    public String violationType = "";

    @C09CT("perception_code")
    public String perceptionCode = "";

    @C09CT("perception_subtitle")
    public String perceptionSubtitle = "";

    @C09CT("cg_link_url")
    public String cgLinkUrl = "";

    @C09CT("punish_source")
    public String punishSource = "";

    @C09CT("perception_subtitle_list")
    public List<String> perceptionSubtitleList = new ArrayList();
}
