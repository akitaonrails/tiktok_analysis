package webcast.data.multi_guest_social_data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class Avatar {

    @C09CT("avatar_id")
    public long avatarId;

    @C09CT("created_at")
    public long createdAt;

    @C09CT("image")
    public ImageModel image;

    @C09CT("is_system")
    public boolean isSystem;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("style_id")
    public long styleId;

    @C09CT("updated_at")
    public long updatedAt;

    @C09CT("video_dynamic")
    public Video videoDynamic;

    @C09CT("video_static")
    public Video videoStatic;

    @C09CT("failed_title")
    public String failedTitle = "";

    @C09CT("failed_reason")
    public String failedReason = "";
}
