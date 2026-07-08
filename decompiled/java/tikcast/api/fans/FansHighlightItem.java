package tikcast.api.fans;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.replay.proto.PostedVideo;

/* JADX INFO: loaded from: classes.dex */
public final class FansHighlightItem {

    @C09CT("fans_info")
    public User fansInfo;

    @C09CT("im_content")
    public String imContent = "";

    @C09CT("video")
    public PostedVideo video;
}
