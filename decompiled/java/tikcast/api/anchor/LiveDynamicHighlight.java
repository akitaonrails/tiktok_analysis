package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;

/* JADX INFO: loaded from: classes.dex */
public final class LiveDynamicHighlight {

    @C09CT("create_time")
    public long createTime;

    @C09CT("fragment_type")
    public int fragmentType;

    @C09CT("mp4_video_meta_info")
    public VideoMetaInfo mp4VideoMetaInfo;

    @C09CT("show_info")
    public LiveFragmentShowInfo showInfo;

    @C09CT("video_duration")
    public long videoDuration;

    @C09CT("vv")
    public long vv;

    @C09CT("fragment_id")
    public String fragmentId = "";

    @C09CT("cover_url")
    public String coverUrl = "";

    @C09CT("item_id")
    public String itemId = "";

    @C09CT("room_id")
    public String roomId = "";
}
