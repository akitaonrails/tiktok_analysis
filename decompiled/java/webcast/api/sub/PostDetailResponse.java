package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import java.util.ArrayList;
import java.util.List;
import webcast.data.SubSplitStatus;

/* JADX INFO: loaded from: classes8.dex */
public final class PostDetailResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchor_info")
        public User anchorInfo;

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("offset")
        public long offset;

        @C09CT("post")
        public SpacePost post;

        @C09CT("sub_split_status")
        public SubSplitStatus subSplitStatus;

        @C09CT("top_comment")
        public SpaceCommentItem topComment;

        @C09CT("most_likes")
        public List<SpaceCommentItem> mostLikes = new ArrayList();

        @C09CT("recent_replies")
        public List<SpaceCommentItem> recentReplies = new ArrayList();
    }
}
