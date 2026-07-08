package webcast.data.multi_guest_play;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeboardContent {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("end_time")
    public long endTime;

    @C09CT("last_review_info")
    public NoticeboardReviewInfo lastReviewInfo;

    @C09CT("noticeboard_id")
    public long noticeboardId;

    @C09CT("position")
    public MicPositionData position;

    @C09CT("room_id")
    public long roomId;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("version")
    public long version;

    @C09CT("linkmic_id")
    public String linkmicId = "";

    @C09CT("stream_id")
    public String streamId = "";

    @C09CT("passed_media_node_id")
    public String passedMediaNodeId = "";
}
