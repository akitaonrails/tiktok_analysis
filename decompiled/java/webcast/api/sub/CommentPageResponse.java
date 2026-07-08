package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class CommentPageResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("comment_list")
        public List<SpaceCommentItem> commentList = new ArrayList();

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("offset")
        public long offset;

        @C09CT("total_count")
        public long totalCount;
    }
}
