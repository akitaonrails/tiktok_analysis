package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewCommentItem {

    @C09CT("comment_time_ms")
    public long commentTimeMs;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("item_type")
    public int itemType;

    @C09CT("content")
    public String content = "";

    @C09CT("content_type")
    public String contentType = "";

    @C09CT("user_avatar")
    public String userAvatar = "";
}
