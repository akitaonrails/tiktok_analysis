package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HighlightCollectionElement {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("is_gif_cover")
    public boolean isGifCover;

    @C09CT("is_posted")
    public boolean isPosted;

    @C09CT("mp4_video_meta_info")
    public VideoMetaInfo mp4VideoMetaInfo;

    @C09CT("original_video_meta_info")
    public VideoMetaInfo originalVideoMetaInfo;

    @C09CT("post_status")
    public int postStatus;

    @C09CT("publish_page_params")
    public PublishPageParams publishPageParams;

    @C09CT("type")
    public int type;

    @C09CT("video_quality_strategy")
    public int videoQualityStrategy;

    @C09CT("video_status")
    public int videoStatus;

    @C09CT("name")
    public String name = "";

    @C09CT("cover_url")
    public String coverUrl = "";

    @C09CT("icon_url")
    public String iconUrl = "";

    @C09CT("video_list")
    public List<HighlightCollectionVideo> videoList = new ArrayList();

    @C09CT("message_content_pb")
    public String messageContentPb = "";

    @C09CT("vid")
    public String vid = "";

    @C09CT("original_vid")
    public String originalVid = "";

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("message_share_scene")
    public String messageShareScene = "";

    @C09CT("gif_cover_url")
    public String gifCoverUrl = "";

    @C09CT("small_cover_url")
    public String smallCoverUrl = "";
}
