package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceInfo {

    @C09CT("has_sub_only_space")
    public boolean hasSubOnlySpace;

    @C09CT("is_quit")
    public boolean isQuit;

    @C09CT("member_count")
    public long memberCount;

    @C09CT("new_post_count")
    public long newPostCount;

    @C09CT("pin_post")
    public SpacePost pinPost;

    @C09CT("post_count")
    public long postCount;

    @C09CT("space_activity_indicator")
    public SpaceActivityIndicator spaceActivityIndicator;
}
