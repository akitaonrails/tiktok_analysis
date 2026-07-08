package tikcast.api.creator_succ;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.replay.proto.PostedVideo;

/* JADX INFO: loaded from: classes.dex */
public final class MediaInfo {

    @C09CT("im_content")
    public String imContent = "";

    @C09CT("image")
    public ImageModel image;

    @C09CT("media_type")
    public int mediaType;

    @C09CT("posted_video")
    public PostedVideo postedVideo;
}
