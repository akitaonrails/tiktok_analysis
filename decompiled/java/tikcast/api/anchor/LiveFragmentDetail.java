package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.android.livesdk.replay.proto.SpriteImageItem;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveFragmentDetail {

    @C09CT("ai_clip_widget")
    public AiClipWidget aiClipWidget;

    @C09CT("business_id")
    public long businessId;

    @C09CT("business_score")
    public long businessScore;

    @C09CT("create_time")
    public long createTime;

    @C09CT("end_time")
    public long endTime;

    @C09CT("forecast_gen_need_time")
    public long forecastGenNeedTime;

    @C09CT("fragment_id")
    public long fragmentId;

    @C09CT("fragment_type")
    public int fragmentType;

    @C09CT("fragment_type_new")
    public int fragmentTypeNew;

    @C09CT("has_detected_music")
    public boolean hasDetectedMusic;

    @C09CT("height")
    public long height;

    @C09CT("is_edit")
    public int isEdit;

    @C09CT("is_gif_cover")
    public boolean isGifCover;

    @C09CT("is_muted")
    public boolean isMuted;

    @C09CT("is_posted")
    public boolean isPosted;

    @C09CT("mark_time")
    public long markTime;

    @C09CT("mp4_video_meta_info")
    public VideoMetaInfo mp4VideoMetaInfo;

    @C09CT("op_time")
    public long opTime;

    @C09CT("original_mp4_video_meta_info")
    public VideoMetaInfo originalMp4VideoMetaInfo;

    @C09CT("owner_user_id")
    public long ownerUserId;

    @C09CT("post_by_scene")
    public int postByScene;

    @C09CT("post_status")
    public int postStatus;

    @C09CT("publish_page_params")
    public PublishPageParams publishPageParams;

    @C09CT("rendered")
    public boolean rendered;

    @C09CT("replay_create_time")
    public long replayCreateTime;

    @C09CT("replay_relative_time")
    public long replayRelativeTime;

    @C09CT("resolution_changed")
    public boolean resolutionChanged;

    @C09CT("revert_mp4_video_meta_info")
    public VideoMetaInfo revertMp4VideoMetaInfo;

    @C09CT("revert_status")
    public int revertStatus;

    @C09CT("room_id")
    public long roomId;

    @C09CT("show_info")
    public LiveFragmentShowInfo showInfo;

    @C09CT("show_revert_video")
    public boolean showRevertVideo;

    @C09CT("start_time")
    public long startTime;

    @C09CT("update_time")
    public long updateTime;

    @C09CT("video_duration")
    public float videoDuration;

    @C09CT("video_quality_strategy")
    public int videoQualityStrategy;

    @C09CT("video_size")
    public long videoSize;

    @C09CT("video_status")
    public int videoStatus;

    @C09CT("witdh")
    public long witdh;

    @C09CT("fragment_id_str")
    public String fragmentIdStr = "";

    @C09CT("vid")
    public String vid = "";

    @C09CT("download_url")
    public String downloadUrl = "";

    @C09CT("cover_url")
    public String coverUrl = "";

    @C09CT("extra")
    public String extra = "";

    @C09CT("title")
    public String title = "";

    @C09CT("stream_url")
    public String streamUrl = "";

    @C09CT("preview_pic_url")
    public String previewPicUrl = "";

    @C09CT("room_id_str")
    public String roomIdStr = "";

    @C09CT("owner_user_id_str")
    public String ownerUserIdStr = "";

    @C09CT("business_extra")
    public String businessExtra = "";

    @C09CT("sprite_list")
    public List<SpriteImageItem> spriteList = new ArrayList();

    @C09CT("sub_type")
    public String subType = "";

    @C09CT("fragment_id_encode")
    public String fragmentIdEncode = "";

    @C09CT("message_content_pb")
    public String messageContentPb = "";

    @C09CT("original_vid")
    public String originalVid = "";

    @C09CT("message_share_scene")
    public String messageShareScene = "";

    @C09CT("revert_vid")
    public String revertVid = "";

    @C09CT("gif_cover_url")
    public String gifCoverUrl = "";

    @C09CT("item_id_str")
    public String itemIdStr = "";

    @C09CT("small_cover_url")
    public String smallCoverUrl = "";

    @C09CT("cover_theme_color")
    public List<String> coverThemeColor = new ArrayList();

    @C09CT("long_title")
    public String longTitle = "";
}
