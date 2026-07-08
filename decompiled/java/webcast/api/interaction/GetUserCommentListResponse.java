package webcast.api.interaction;

import X.C09CT;
import com.bytedance.android.livesdk.model.CommentDetail;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetUserCommentListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("comment_list")
        public List<CommentDetail> commentList = new ArrayList();

        @C09CT("has_more")
        public long hasMore;
    }
}
