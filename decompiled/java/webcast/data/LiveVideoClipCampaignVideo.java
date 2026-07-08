package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveVideoClipCampaignVideo {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("anchor_report_status")
    public int anchorReportStatus;

    @C09CT("clipper_appeal_status")
    public int clipperAppealStatus;

    @C09CT("clipper_user_id")
    public long clipperUserId;

    @C09CT("contribute_time")
    public long contributeTime;

    @C09CT("has_followed")
    public boolean hasFollowed;

    @C09CT("item_id")
    public long itemId;

    @C09CT("review_status")
    public int reviewStatus;

    @C09CT("task_id")
    public long taskId;

    @C09CT("traffic")
    public Traffic traffic;

    @C09CT("clipper_user_id_str")
    public String clipperUserIdStr = "";

    @C09CT("clipper_user_name")
    public String clipperUserName = "";

    @C09CT("item_id_str")
    public String itemIdStr = "";

    @C09CT("video_name")
    public String videoName = "";

    @C09CT("cover_url")
    public String coverUrl = "";

    @C09CT("task_id_str")
    public String taskIdStr = "";

    @C09CT("anchor_id_str")
    public String anchorIdStr = "";

    @C09CT("video_play_url")
    public String videoPlayUrl = "";

    @C09CT("reject_reason")
    public String rejectReason = "";

    @C09CT("clipper_appeal_reason")
    public String clipperAppealReason = "";

    /* JADX INFO: loaded from: classes27.dex */
    public static final class Traffic {

        @C09CT("qualified_vv")
        public long qualifiedVv;

        @C09CT("total_vv")
        public long totalVv;

        @C09CT("un_qualified_traffic_detail")
        public List<UnQualifiedTrafficDetail> unQualifiedTrafficDetail = new ArrayList();

        @C09CT("un_qualified_vv")
        public long unQualifiedVv;

        public static final class UnQualifiedTrafficDetail {

            @C09CT("percentage")
            public float percentage;

            @C09CT("reason")
            public String reason = "";
        }
    }
}
