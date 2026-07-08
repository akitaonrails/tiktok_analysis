package webcast.im;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarStyleResultMessage extends AbstractC1136060ffY {

    @C09CT("image")
    public ImageModel image;

    @C09CT("origin_image_uri")
    public String originImageUri;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("status_message")
    public String statusMessage;

    @C09CT("style_id")
    public long styleId;

    @C09CT("task_id")
    public long taskId;

    public AvatarStyleResultMessage() {
        this.type = C001A.AVATAR_STYLE_RESULT_MESSAGE;
        this.statusMessage = "";
        this.originImageUri = "";
    }
}
