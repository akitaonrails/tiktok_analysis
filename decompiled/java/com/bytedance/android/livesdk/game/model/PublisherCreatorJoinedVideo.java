package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PublisherCreatorJoinedVideo {

    @C09CT("anchor_valid_view")
    public long anchorValidView;

    @C09CT("appeal_info")
    public PublisherVideoAppealInfo appealInfo;

    @C09CT("billing_indicator")
    public int billingIndicator;

    @C09CT("duration_sec")
    public int durationSec;

    @C09CT("expect_billing_status")
    public int expectBillingStatus;

    @C09CT("game_valid_install")
    public long gameValidInstall;

    @C09CT("is_deleted")
    public boolean isDeleted;

    @C09CT("item_create_ts")
    public long itemCreateTs;

    @C09CT("item_private_delete_ts")
    public long itemPrivateDeleteTs;

    @C09CT("last_updated_at")
    public long lastUpdatedAt;

    @C09CT("mode")
    public int mode;

    @C09CT("post_status")
    public int postStatus;

    @C09CT("post_ts")
    public long postTs;

    @C09CT("rank_points")
    public long rankPoints;

    @C09CT("reject_reason_type")
    public int rejectReasonType;

    @C09CT("round")
    public int round;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("submit_ts")
    public long submitTs;

    @C09CT("video_cp_moderation_info")
    public PublisherVideoCPModerationInfo videoCpModerationInfo;

    @C09CT("video_first_completed_moderation_time")
    public long videoFirstCompletedModerationTime;

    @C09CT("video_record_status")
    public int videoRecordStatus;

    @C09CT("video_reject_step")
    public int videoRejectStep;

    @C09CT("video_valid_view")
    public long videoValidView;

    @C09CT("item_id")
    public String itemId = "";

    @C09CT("cover_image_url")
    public String coverImageUrl = "";

    @C09CT("estimated_revenue")
    public String estimatedRevenue = "";

    @C09CT("game_name")
    public String gameName = "";

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("reject_reason_list")
    public List<Integer> rejectReasonList = new ArrayList();

    @C09CT("title")
    public String title = "";

    @C09CT("video_id")
    public String videoId = "";

    @C09CT("post_id")
    public String postId = "";

    @C09CT("video_play_url")
    public String videoPlayUrl = "";

    @C09CT("video_reject_reason_list")
    public List<Integer> videoRejectReasonList = new ArrayList();
}
